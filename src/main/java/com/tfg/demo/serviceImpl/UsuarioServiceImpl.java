/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.serviceImpl;

import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import com.tfg.demo.dominio.Usuario;
import com.tfg.demo.modeloDao.UsuarioRepositorio;
import com.tfg.demo.service.UsuarioService;
import java.io.Serializable;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author igorr
 */
@Service
public class UsuarioServiceImpl implements Serializable, UsuarioService {

    private static final Logger log = LoggerFactory.getLogger(UsuarioServiceImpl.class);

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Override
    public List<Usuario> dameTodosUsuarios() {
        List<Usuario> misUsuarios = new ArrayLinkedList<>();

        try {
            log.debug("metodo: " + "dameTodosUsuarios " + "comienza ejecucion...");
            misUsuarios = usuarioRepositorio.findAll();
            log.debug("metodo: " + "dameTodosUsuarios " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "dameTodosUsuarios " + "ha fallado por razon: " + e.getMessage());

        }
        return misUsuarios;

    }

    @Override
    public void borrameUsuario(Usuario usuario) {
        try {
            log.debug("metodo: " + "borrameUsuario " + "comienza ejecucion...");

            usuarioRepositorio.delete(usuario);
            log.debug("metodo: " + "borrameUsuario " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "borrameUsuario " + "ha fallado por razon: " + e.getMessage());

        }

    }

    @Override
    public Usuario actualizaUsuario(Usuario usuario) {
        try {
            log.debug("metodo: " + "actualizaUsuario " + "comienza ejecucion...");

            Usuario usuarioAntiguo = usuarioRepositorio.findById(usuario.getId()).orElse(null);
            if (usuarioAntiguo != null) {
                usuarioRepositorio.delete(usuarioAntiguo);
                usuarioRepositorio.save(usuario);
            }
            log.debug("metodo: " + "actualizaUsuario " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "actualizaUsuario " + "ha fallado por razon: " + e.getMessage());

        }
        return usuario;
    }

    @Override
    public Usuario dameUsuarioPorId(String cd_usuario) {
        
        Usuario usuarioAntiguo=new Usuario();
         try {
            log.debug("metodo: " + "dameUsuarioPorId " + "comienza ejecucion...");

            usuarioAntiguo = usuarioRepositorio.findById(cd_usuario).orElse(null);
            
            log.debug("metodo: " + "dameUsuarioPorId " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "dameUsuarioPorId " + "ha fallado por razon: " + e.getMessage());

        }
         
         return usuarioAntiguo;

    }

    @Override
    public void guardaUsuario(Usuario usuario) {
        try {
            log.debug("metodo: " + "guardaUsuario " + "comienza ejecucion...");

            usuarioRepositorio.save(usuario);
            
            log.debug("metodo: " + "guardaUsuario " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "guardaUsuario " + "ha fallado por razon: " + e.getMessage());

        }


    }

}
