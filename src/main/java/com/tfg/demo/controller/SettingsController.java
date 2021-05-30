/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.controller;

import com.tfg.demo.dominio.Portada;
import com.tfg.demo.serviceImpl.PortadaServiceImpl;
import com.tfg.demo.utils.GeneradorIdentificador;
import com.tfg.dto.PortadaDto;
import java.io.Serializable;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author igorr
 */
@Controller
public class SettingsController implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(SettingsController.class);

    
    @Autowired
    private PortadaServiceImpl portadaServiceImpl;

    @PostMapping("/settings")
    public String rellenamePortada(@ModelAttribute PortadaDto portadaDto, Model model) {
        Portada portadaNueva = new Portada();
        log.debug("el metodo: " + "rellenamePortada" + "comenzando...");
        String id = new GeneradorIdentificador().uuid();

        portadaNueva.setCdPortada(id);
        portadaNueva.setTitulo(portadaDto.getTitulo());
        portadaNueva.setDescripcion(portadaDto.getDescripcion());
        portadaNueva.setFechaCreacion(new Date());
        int i = portadaDto.getVersion();
        if (i == 0) {
            portadaNueva.setVersion(1);
        } else {
            portadaNueva.setVersion(i++);
        }
        model.addAttribute("portadaDto", portadaDto);
        portadaServiceImpl.guardarPortada(portadaNueva);
        log.debug("el metodo: " + "rellenamePortada" + "se ha añadido el modelo...");
        log.info(portadaDto.toString());

        return "redirect:/";
    }

}
