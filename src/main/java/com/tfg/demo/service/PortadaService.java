/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.service;

import com.tfg.demo.dominio.Portada;
import java.util.List;

/**
 *
 * @author igorr
 */
public interface PortadaService {
    
    void guardarPortada(Portada portada);
    
    List<Portada> dameTodasPortdas();
    
    Portada dameUltimaPortada();
    
    void actualizaPortada(Portada portada);
    
    
    
    
    
    
    
}
