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
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author igorr
 */
@Entity
@Table(name = "contenido_comentaio")
public class ContenidoComentario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cd_contenido_comentario")
    private String cdContenidoComenteario;
    @OneToOne
    @JoinColumn(name = "id_usuario" )
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "id_comentario")
    private Comentario comentario;

    //Auditoria
    @Column(name = "fecha_creacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "usuario_cracion")
    private String usuarioCreacion;
    @Column(name = "usuario_modifiacion")
    private String usuarioModificacion;
    @Column(name = "fecha_modificacion")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaModificacion;

    public ContenidoComentario() {
    }

    public ContenidoComentario(String cdContenidoComenteario, Usuario usuario, Comentario comentario, Date fechaCreacion, String usuarioCreacion, String usuarioModificacion, Date fechaModificacion) {
        this.cdContenidoComenteario = cdContenidoComenteario;
        this.usuario = usuario;
        this.comentario = comentario;
        this.fechaCreacion = fechaCreacion;
        this.usuarioCreacion = usuarioCreacion;
        this.usuarioModificacion = usuarioModificacion;
        this.fechaModificacion = fechaModificacion;
    }

    
    
    public String getCdContenidoComenteario() {
        return cdContenidoComenteario;
    }

    public void setCdContenidoComenteario(String cdContenidoComenteario) {
        this.cdContenidoComenteario = cdContenidoComenteario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Comentario getComentario() {
        return comentario;
    }

    public void setComentario(Comentario comentario) {
        this.comentario = comentario;
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
        return "ContenidoComentario{" + "cdContenidoComenteario=" + cdContenidoComenteario + ", usuario=" + usuario + ", comentario=" + comentario + ", fechaCreacion=" + fechaCreacion + ", usuarioCreacion=" + usuarioCreacion + ", usuarioModificacion=" + usuarioModificacion + ", fechaModificacion=" + fechaModificacion + '}';
    }

}
