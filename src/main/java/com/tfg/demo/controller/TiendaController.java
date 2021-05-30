/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.controller;

import com.tfg.dto.comentario.ProductoDto;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author igorr
 */
@Controller
@RequestMapping("tienda/")
public class TiendaController {
    
    private static final Logger log = LoggerFactory.getLogger(TiendaController.class);
    
    @GetMapping("addproducto/")
    public String guardaProductos(Model model) {
        ProductoDto productoNuevo= new ProductoDto();
        log.debug("el metodo: " + "guardaProductos " + " ha funcionado...");
        model.addAttribute("productoNuevo",productoNuevo);
        return "addproducto";
    }

    
    
}
