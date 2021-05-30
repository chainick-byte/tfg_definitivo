/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.controller;

import com.tfg.demo.dominio.Producto;
import com.tfg.demo.serviceImpl.comentario.ProductoServiceImpl;
import com.tfg.demo.utils.DescargaImagen;
import com.tfg.demo.utils.GeneradorIdentificador;
import com.tfg.dto.comentario.ProductoDto;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author igorr
 */
@Controller
public class ProductoController {

    private static final Logger log = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoServiceImpl productoService;

    @PostMapping("/tienda/addproducto/")
    public String rellenaProductoNuevo(@ModelAttribute ProductoDto productoNuevo, Model model, @RequestParam("archivoImagen") MultipartFile multipart) {
        log.debug("el metodo: " + "rellenaProductoNuevo " + " ha funcionado...");
        Producto p = new Producto();
        p.setCdProducto(GeneradorIdentificador.uuid());
        p.setNombreProducto(productoNuevo.getNombreProductoDto());
        p.setDescripcionProducto(productoNuevo.getDescripcionProductoDto());
        p.setCantidad(productoNuevo.getCantidadDto());
        p.setFechaCreacion(new Date());
        p.setPrecio(productoNuevo.getPrecioDto());
        log.debug("el multipart esta vacio ? :" + multipart.isEmpty());
        if (!multipart.isEmpty()) {
            

            String ruta = "c://imagen//";
            String nombreImagen = DescargaImagen.descargaImagen(multipart, ruta);
            log.debug("nombe de la imagen  :" + nombreImagen);

            if (nombreImagen != null) {
                p.setImagenProducto(nombreImagen);
            }
        }

        p.setFechaCreacion(new Date());
        model.addAttribute("productoNuevo", productoNuevo);
        productoService.guardaProducto(p);
        log.debug("el metodo: " + "rellenaProductoNuevo " + " guardando producto...");
        log.info(productoNuevo.toString());

        return "redirect:/tienda/addproducto/";
    }

}
