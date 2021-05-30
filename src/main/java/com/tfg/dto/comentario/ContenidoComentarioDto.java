/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.dto.comentario;

import com.tfg.dto.UsuarioJavaDto;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author igorr
 */
public class ContenidoComentarioDto implements Serializable {
    
        private static final long serialVersionUID = 1L;

    
    private String cdContenidoComentarioDto;
    private ContenidoComentarioDto contenidoComentarioDto;
    private ComentarioDto comentarioDto;
    private UsuarioJavaDto usarioDto;

    private Date fechaCreacion;
    private String usuarioCreacion;
    private String usuarioModificacion;
    private Date fechaModificacion;

    public ContenidoComentarioDto() {
    }

    public ContenidoComentarioDto(String cdContenidoComentarioDto, ContenidoComentarioDto contenidoComentarioDto, ComentarioDto comentarioDto, UsuarioJavaDto usarioDto, Date fechaCreacion, String usuarioCreacion, String usuarioModificacion, Date fechaModificacion) {
        this.cdContenidoComentarioDto = cdContenidoComentarioDto;
        this.contenidoComentarioDto = contenidoComentarioDto;
        this.comentarioDto = comentarioDto;
        this.usarioDto = usarioDto;
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.fechaModificacion = fechaModificacion;
    }

    public String getCdContenidoComentarioDto() {
        return cdContenidoComentarioDto;
    }

    public void setCdContenidoComentarioDto(String cdContenidoComentarioDto) {
        this.cdContenidoComentarioDto = cdContenidoComentarioDto;
    }

    public ContenidoComentarioDto getContenidoComentarioDto() {
        return contenidoComentarioDto;
    }

    public void setContenidoComentarioDto(ContenidoComentarioDto contenidoComentarioDto) {
        this.contenidoComentarioDto = contenidoComentarioDto;
    }

    public ComentarioDto getComentarioDto() {
        return comentarioDto;
    }

    public void setComentarioDto(ComentarioDto comentarioDto) {
        this.comentarioDto = comentarioDto;
    }

    public UsuarioJavaDto getUsarioDto() {
        return usarioDto;
    }

    public void setUsarioDto(UsuarioJavaDto usarioDto) {
        this.usarioDto = usarioDto;
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

    
    
    
}
