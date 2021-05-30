/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.dto.comentario;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author igorr
 */
public class ComentarioDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cdComentarioDto;
    private String comentarioDto;
    
    
    
    private Date fechaCreacionDto;
    private String usuarioCreacionDto;
    private String usuarioModificacionDto;
    private Date fechaModificacionDto;

    public ComentarioDto() {
    }

    public ComentarioDto(String cdComentarioDto, String comentarioDto, Date fechaCreacion, String usuarioCreacion, String usuarioModificacion, Date fechaModificacion) {
        this.cdComentarioDto = cdComentarioDto;
        this.comentarioDto = comentarioDto;
        this.fechaCreacionDto = fechaCreacion;
        this.usuarioCreacionDto = usuarioCreacion;
        this.usuarioModificacionDto = usuarioModificacion;
        this.fechaModificacionDto = fechaModificacion;
    }

    public String getCdComentarioDto() {
        return cdComentarioDto;
    }

    public void setCdComentarioDto(String cdComentarioDto) {
        this.cdComentarioDto = cdComentarioDto;
    }

    public String getComentarioDto() {
        return comentarioDto;
    }

    public void setComentarioDto(String comentarioDto) {
        this.comentarioDto = comentarioDto;
    }

    public Date getFechaCreacionDto() {
        return fechaCreacionDto;
    }

    public void setFechaCreacionDto(Date fechaCreacion) {
        this.fechaCreacionDto = fechaCreacion;
    }

    public String getUsuarioCreacionDto() {
        return usuarioCreacionDto;
    }

    public void setUsuarioCreacionDto(String usuarioCreacion) {
        this.usuarioCreacionDto = usuarioCreacion;
    }

    public String getUsuarioModificacionDto() {
        return usuarioModificacionDto;
    }

    public void setUsuarioModificacionDto(String usuarioModificacion) {
        this.usuarioModificacionDto = usuarioModificacion;
    }

    public Date getFechaModificacionDto() {
        return fechaModificacionDto;
    }

    public void setFechaModificacionDto(Date fechaModificacion) {
        this.fechaModificacionDto = fechaModificacion;
    }

    @Override
    public String toString() {
        return "ComentarioDto{" + "cdComentarioDto=" + cdComentarioDto + ", comentarioDto=" + comentarioDto + ", fechaCreacion=" + fechaCreacionDto + ", usuarioCreacion=" + usuarioCreacionDto + ", usuarioModificacion=" + usuarioModificacionDto + ", fechaModificacion=" + fechaModificacionDto + '}';
    }

    
    
}
