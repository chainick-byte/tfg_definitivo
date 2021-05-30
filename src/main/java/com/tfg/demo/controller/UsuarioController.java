/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.controller;

import com.tfg.demo.dominio.Usuario;
import com.tfg.demo.serviceImpl.UsuarioServiceImpl;
import com.tfg.demo.utils.GeneradorIdentificador;
import com.tfg.dto.UsuarioJavaDto;
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
public class UsuarioController implements Serializable {
    
    private static final Logger log = LoggerFactory.getLogger(UsuarioController.class);
    
    @Autowired
    private UsuarioServiceImpl usuarioService;
    
    @PostMapping("/registro")
    public String guardarUsuario(@ModelAttribute UsuarioJavaDto usuarioDto, Model model) {
        log.debug("el metodo: " + "guardarUsuario" + "comenzando...");
        Usuario usuarioNuevo=new Usuario();
        String id=new GeneradorIdentificador().uuid();
        usuarioNuevo.setId(id);
        usuarioNuevo.setNombre(usuarioDto.getNombre());
        usuarioNuevo.setPrimerApellido(usuarioDto.getPrimerApellido());
        usuarioNuevo.setSegundoApellido(usuarioDto.getSegundoApellido());
        usuarioNuevo.setNickname(usuarioDto.getNickname());
        usuarioNuevo.setFecha_creacion(new Date());
        usuarioNuevo.setEmail(usuarioDto.getEmail());
        usuarioNuevo.setTelefono(usuarioDto.getTelefono());
        usuarioNuevo.setContrasenha(usuarioDto.getContrasenha_1());
        usuarioNuevo.setCd_usuario(id);
        
        model.addAttribute("usuarioDto", usuarioDto);
        usuarioService.guardaUsuario(usuarioNuevo);
        log.debug("el metodo: " + "guardarUsuario" + "se ha añadido el modelo...");
        log.info(usuarioDto.toString());
        return "redirect:/";
    }
    
}
