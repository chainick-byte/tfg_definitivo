/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.service.comentario;

import com.tfg.demo.dominio.ContenidoComentario;
import java.util.List;


/**
 *
 * @author igorr
 */
public interface ContenidoComentarioService {
    
    void guardaConenidoComentario(ContenidoComentario contenidoCOmentario);
    
    List<ContenidoComentario>dameComentariosDeProductos(ContenidoComentario contenidoComentario);
    
    ContenidoComentario dameComentario(String cdContenidoComentario );
    
    void borraComentario(ContenidoComentario contenidoComentario);
    
}
