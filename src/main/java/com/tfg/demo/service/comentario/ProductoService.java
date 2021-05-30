/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.service.comentario;

import com.tfg.demo.dominio.Producto;
import java.util.List;

/**
 *
 * @author igorr
 */
public interface ProductoService {
    
    List<Producto> dameTodosLosProductos();
    
    Producto dameProductoPorId(String cdPortada);
    
    void borraProducto(Producto producto);
    
    Producto actualizaEsteProducto(Producto producto);

    public void guardaProducto(Producto p);
    
}
