/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.serviceImpl.comentario;

import com.tfg.demo.dominio.Producto;
import com.tfg.demo.modeloDao.ProductoRepositorio;
import com.tfg.demo.service.comentario.ProductoService;
import java.util.ArrayList;
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
public class ProductoServiceImpl implements ProductoService {

    private static final Logger log = LoggerFactory.getLogger(ProductoServiceImpl.class);

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> dameTodosLosProductos() {
        List<Producto> misProducto = new ArrayList<>();
        try {
            log.debug("metodo: " + "dameTodosLosProductos " + "comienza ejecucion...");
            misProducto = productoRepositorio.findAll();
            log.debug("metodo: " + "dameTodosLosProductos " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "dameTodosLosProductos " + "ha fallado por razon: " + e.getMessage());

        }
        return misProducto;
    }

    @Override
    public Producto dameProductoPorId(String cdPortada) {
        Producto miProducto = new Producto();
        try {
            log.debug("metodo: " + "dameProductoPorId " + "comienza ejecucion...");
            miProducto = productoRepositorio.findById(cdPortada).orElse(null);
            log.debug("metodo: " + "dameProductoPorId " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "dameProductoPorId " + "ha fallado por razon: " + e.getMessage());

        }
        return miProducto;
    }

    @Override
    public void borraProducto(Producto producto) {
        try {
            log.debug("metodo: " + "borraProducto " + "comienza ejecucion...");
            productoRepositorio.delete(producto);
            log.debug("metodo: " + "borraProducto " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "borraProducto " + "ha fallado por razon: " + e.getMessage());

        }
    }

    @Override
    public Producto actualizaEsteProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void guardaProducto(Producto p) {
        try {
            log.debug("metodo: " + "guardaProductoServiceImpl " + "comienza ejecucion...");
            productoRepositorio.save(p);
            log.debug("metodo: " + "guardaProductoServiceImpl " + "finaliza  ejecucion...");

        } catch (Exception e) {
            log.debug("metodo: " + "guardaProductoServiceImpl " + "ha fallado por razon: " + e.getMessage());

        }
    }

}
