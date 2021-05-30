/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.serviceImpl;

import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import com.tfg.demo.dominio.Portada;
import com.tfg.demo.modeloDao.PortadaRepositorio;
import com.tfg.demo.service.PortadaService;
import java.io.Serializable;
import java.util.Date;
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
public class PortadaServiceImpl implements PortadaService, Serializable {

    private static final Logger log = LoggerFactory.getLogger(PortadaServiceImpl.class);

    @Autowired
    private PortadaRepositorio portadaRepositorio;

    @Override
    public void guardarPortada(Portada portada) {
        try {
            log.debug("metodo: " + "guardarPortada " + "comienza ejecucion...");
            portadaRepositorio.save(portada);
            log.debug("metodo: " + "guardarPortada " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "guardarPortada " + "ha fallado por razon: " + e.getMessage());

        }

    }

    @Override
    public List<Portada> dameTodasPortdas() {
        List<Portada> miListaPortadas = new ArrayLinkedList<>();

        try {
            log.debug("metodo: " + "dameTodasPortdas " + "comienza ejecucion...");
            miListaPortadas = portadaRepositorio.findAll();
            log.debug("metodo: " + "dameTodasPortdas " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "dameTodasPortdas " + "ha fallado por razon: " + e.getMessage());

        }
        return miListaPortadas;
    }
    

//    @Override
//    public Portada dameUltimaPortada() {
//        Portada miUltimaPortada = new Portada();
//        List<Portada> l = new ArrayLinkedList<>();
//        try {
//            log.debug("metodo: " + "dameUltimaPortada " + "comienza ejecucion...");
//            l = (List<Portada>) portadaRepositorio.findByFechaCreacionOrderByDesc();
//            log.debug("metodo: " + "dameUltimaPortada " + "finaliza  ejecucion...");
//
//        } catch (Exception e) {
//            log.debug("metodo: " + "dameUltimaPortada " + "ha fallado por razon: " + e.getMessage());
//
//        }
//        if (l != null) {
//            miUltimaPortada = l.get(0);
//        }
//        return miUltimaPortada;
//    }

    @Override
    public void actualizaPortada(Portada portada) {
        Portada aux=new Portada();
        try {
            log.debug("metodo: " + "actualizaPortada " + "comienza ejecucion...");
            aux=portadaRepositorio.findById(portada.getCdPortada()).orElse(null);
            portadaRepositorio.delete(aux);
            portada.setFechaModificacion(new Date());
            portadaRepositorio.save(portada);
            log.debug("metodo: " + "actualizaPortada " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "actualizaPortada " + "ha fallado por razon: " + e.getMessage());

        }
    }

    @Override
    public Portada dameUltimaPortada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
