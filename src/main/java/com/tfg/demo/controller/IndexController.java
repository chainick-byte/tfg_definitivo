/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.controller;

import com.tfg.demo.dominio.Portada;
import com.tfg.demo.dominio.Producto;
import com.tfg.demo.serviceImpl.PortadaServiceImpl;
import com.tfg.demo.serviceImpl.comentario.ProductoServiceImpl;
import com.tfg.dto.PortadaDto;
import com.tfg.dto.UsuarioJavaDto;
import java.io.Serializable;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author igorr
 */
@Controller
public class IndexController implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final Logger log = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private PortadaServiceImpl portadaService;

    @Autowired
    private ProductoServiceImpl productoService;

    @GetMapping("/")
    public String damePortada(Model model) {
        log.debug("el metodo: " + "damePortada " + " ha funcionado...");
        List<Portada> portdaRecibidas = portadaService.dameTodasPortdas();
        log.debug("el metodo: " + "damePortada " + " añade modelo a la vista...");

        model.addAttribute("portdaRecibidas", portdaRecibidas);
        log.debug("el metodo: " + "damePortada " + " ha finalizado...");

        return "index";
    }

    @GetMapping("tienda/")
    public String dameTienda(Model model) {
        log.debug("el metodo: " + "dameTienda " + " ha funcionado...");
        List<Producto> productosRecibidos = productoService.dameTodosLosProductos();
        log.debug("el metodo: " + "dameTienda " + " ha cargado el listado de productos...");
        model.addAttribute("productosRecibidos", productosRecibidos);
        log.debug("el metodo: " + "dameTienda " + " ha cargado productos en el modelo...");
        return "tienda";
    }

    @GetMapping("settings/")
    public String dameSettings(Model model) {
        PortadaDto portadaDto = new PortadaDto();
        log.debug("el metodo: " + "dameSettings" + " ha funcionado...");
        model.addAttribute("portadaDto", portadaDto);
        return "settings";
    }

    @GetMapping("registro/")
    public String dameRegistro(Model model) {
        log.debug("el metodo: " + "dameRegistro" + " ha funcionado...");
        model.addAttribute("usuarioDto", new UsuarioJavaDto());
        log.debug("el metodo: " + "dameRegistro" + " ha añadido modelo usuarioDto a la visto...");
        return "registro";
    }

}
