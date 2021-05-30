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

/**
 *
 * @author igorr
 */
@Entity
@Table(name = "portada")
public class Portada implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cdportada", length = 32)
    private String cdPortada;
    @Column(name = "fecha_creacion")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "fecha_modificacion")
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaModificacion;
    @Column(name = "titulo", length = 1024)
    private String titulo;
    @Column(name = "descipcion", length = 4000)
    private String descripcion;
    @Column(name = "version_portada")
    private int version;

    public Portada() {
    }

    public Portada(String cdPortada, Date fechaCreacion, Date fechaModificacion, String titulo, String descripcion, int version) {
        this.cdPortada = cdPortada;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getCdPortada() {
        return cdPortada;
    }

    public void setCdPortada(String cdPortada) {
        this.cdPortada = cdPortada;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
