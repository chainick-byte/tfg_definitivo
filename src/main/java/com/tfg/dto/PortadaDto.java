/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.dto;

import java.io.Serializable;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author igorr
 */
public class PortadaDto implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(PortadaDto.class);

    private String cdPortada;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String titulo;
    private String descripcion;
    private int version;

    public PortadaDto() {
    }

    public PortadaDto(String cdPortada, int version, Date fechaCreacion, Date fechaModificacion, String titulo, String descripcion) {
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

    @Override
    public String toString() {
        return "PortadaDto{" + "cdPortada=" + cdPortada + ", fechaCreacion=" + fechaCreacion + ", fechaModificacion=" + fechaModificacion + ", titulo=" + titulo + ", descripcion=" + descripcion + '}';
    }

}
