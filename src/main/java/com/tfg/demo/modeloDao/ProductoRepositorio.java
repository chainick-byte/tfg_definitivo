/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.modeloDao;

import com.tfg.demo.dominio.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author igorr
 */
@Repository
public interface ProductoRepositorio extends  JpaRepository<Producto, String>{
    
}
