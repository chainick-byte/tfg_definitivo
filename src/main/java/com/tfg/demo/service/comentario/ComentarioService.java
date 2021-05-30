/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.service.comentario;

import com.tfg.demo.dominio.Comentario;
import java.util.List;


/**
 *
 * @author igorr
 */
public interface ComentarioService{
    
    void guardaComentario(Comentario comentario); 
    
    List<Comentario>dameTodosComentarios();
    
    Comentario editar(Comentario comentario);
    
    void borraComentario(Comentario comentario);
    
}
