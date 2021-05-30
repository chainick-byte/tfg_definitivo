/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.modeloDao;

import com.tfg.demo.dominio.ContenidoComentario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author igorr
 */
public interface NewRepositorycontenidoComentarioRepositorio extends JpaRepository<ContenidoComentario, String> {
    
}
