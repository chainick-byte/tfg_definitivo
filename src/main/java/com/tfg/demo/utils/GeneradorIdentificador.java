/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.utils;

import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author igorr
 */
public class GeneradorIdentificador implements Serializable{
    
    
    private static final Logger log = LoggerFactory.getLogger(GeneradorIdentificador.class);
    
    public static final String uuid(){
    String result = java.util.UUID.randomUUID().toString().replace("-", "");

    result.substring(0, 32);
    
    //result.replace("b", "-");
        log.debug("el id enerado es "+ result);

    return result;
}
    
}
