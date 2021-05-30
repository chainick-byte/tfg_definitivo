/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.service;

import com.tfg.demo.dominio.Usuario;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author igorr
 */
public interface UsuarioService {

    public List<Usuario> dameTodosUsuarios();

    public void borrameUsuario(Usuario usuario);
    @Transactional
    public Usuario actualizaUsuario(Usuario usuario);
    
    public Usuario dameUsuarioPorId(String cd_usuario);
    @Transactional
    public void guardaUsuario(Usuario usuario);

}
