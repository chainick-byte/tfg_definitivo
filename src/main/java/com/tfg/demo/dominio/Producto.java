/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author igorr
 */
@Entity
@Table(name="producto")
public class Producto implements Serializable{
    
     private static final long serialVersionUID = 1L;
     
     @Id
     @Column(name="cd_portada",length=32)
     private String cdProducto;
     @Column(name="nombre_producto", length=1000)
     private String nombreProducto;
     @Column(name="desciprcion_producto", length=4000)
     private String descripcionProducto;
     @Column(name="fecha_publicacion")
     @Temporal(javax.persistence.TemporalType.DATE)
     private Date fechaPublicacion;
     @Column(name="cantidad")
     private int cantidad;
     @Column(name="precio", columnDefinition = "decimal", precision=4, scale=2)
     private float precio;
     @Column(name="imagen",length=1000)
     private String imagenProducto;
     
     
     //Auditoria
     @Column(name="fecha_creacion")
     private Date fechaCreacion;
     @Column(name="usuario_cracion")
     private String usuarioCreacion;
     @Column(name="usuario_modifiacion")
     private String usuarioModificacion;
     @Column(name="fecha_modificacion")
     private Date fechaModificacion;

    public Producto() {
    }

    public Producto(String cdProducto, String nombreProducto, String descripcionProducto, Date fechaPublicacion, String imagenProducto, int cantidad, float precio, String imagen, Date fechaCreacion, String usuarioCreacion, String usuarioModificacion, Date fechaModificacion) {
        this.cdProducto = cdProducto;
        this.nombreProducto = nombreProducto;
        this.descripcionProducto = descripcionProducto;
        this.fechaPublicacion = fechaPublicacion;
        this.imagenProducto = imagenProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.fechaModificacion = fechaModificacion;
    }

    
    public String getCdProducto() {
        return cdProducto;
    }

    public void setCdProducto(String cdProducto) {
        this.cdProducto = cdProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(String imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }


    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    @Override
    public String toString() {
        return "Producto{" + "cdProducto=" + cdProducto + ", nombreProducto=" + nombreProducto + ", descripcionProducto=" + descripcionProducto + ", fechaPublicacion=" + fechaPublicacion + ", imagenProducto=" + imagenProducto + ", cantidad=" + cantidad + ", precio=" + precio + ", fechaCreacion=" + fechaCreacion + ", usuarioCreacion=" + usuarioCreacion + ", usuarioModificacion=" + usuarioModificacion + ", fechaModificacion=" + fechaModificacion + '}';
    }

    
     
     
     
    
}
