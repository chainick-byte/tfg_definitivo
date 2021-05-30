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
public class ProductoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cdProductoDto;
    private String nombreProductoDto;
    private String descripcionProductoDto;
    private String imagenProductoDto;
    private int cantidadDto;
    private float precioDto;

    private Date fechaCreacionDto;
    private String usuarioCreacionDto;
    private String usuarioModificacionDto;
    private Date fechaModificacionDto;

    public ProductoDto() {
    }

    public ProductoDto(String cdProductoDto, String nombreProductoDto, String descripcionProductoDto, String imagenProductoDto, int cantidadDto, float precioDto, Date fechaCreacionDto, String usuarioCreacionDto, String usuarioModificacionDto, Date fechaModificacionDto) {
        this.cdProductoDto = cdProductoDto;
        this.nombreProductoDto = nombreProductoDto;
        this.descripcionProductoDto = descripcionProductoDto;
        this.imagenProductoDto = imagenProductoDto;
        this.cantidadDto = cantidadDto;
        this.precioDto = precioDto;
        this.fechaCreacionDto = fechaCreacionDto;
        this.usuarioCreacionDto = usuarioCreacionDto;
        this.usuarioModificacionDto = usuarioModificacionDto;
        this.fechaModificacionDto = fechaModificacionDto;
    }

    public String getCdProductoDto() {
        return cdProductoDto;
    }

    public void setCdProductoDto(String cdProductoDto) {
        this.cdProductoDto = cdProductoDto;
    }

    public String getNombreProductoDto() {
        return nombreProductoDto;
    }

    public void setNombreProductoDto(String nombreProductoDto) {
        this.nombreProductoDto = nombreProductoDto;
    }

    public String getDescripcionProductoDto() {
        return descripcionProductoDto;
    }

    public void setDescripcionProductoDto(String descripcionProductoDto) {
        this.descripcionProductoDto = descripcionProductoDto;
    }

    public String getImagenProductoDto() {
        return imagenProductoDto;
    }

    public void setImagenProductoDto(String imagenProductoDto) {
        this.imagenProductoDto = imagenProductoDto;
    }

    public int getCantidadDto() {
        return cantidadDto;
    }

    public void setCantidadDto(int cantidadDto) {
        this.cantidadDto = cantidadDto;
    }

    public float getPrecioDto() {
        return precioDto;
    }

    public void setPrecioDto(float precioDto) {
        this.precioDto = precioDto;
    }

    public Date getFechaCreacionDto() {
        return fechaCreacionDto;
    }

    public void setFechaCreacionDto(Date fechaCreacionDto) {
        this.fechaCreacionDto = fechaCreacionDto;
    }

    public String getUsuarioCreacionDto() {
        return usuarioCreacionDto;
    }

    public void setUsuarioCreacionDto(String usuarioCreacionDto) {
        this.usuarioCreacionDto = usuarioCreacionDto;
    }

    public String getUsuarioModificacionDto() {
        return usuarioModificacionDto;
    }

    public void setUsuarioModificacionDto(String usuarioModificacionDto) {
        this.usuarioModificacionDto = usuarioModificacionDto;
    }

    public Date getFechaModificacionDto() {
        return fechaModificacionDto;
    }

    public void setFechaModificacionDto(Date fechaModificacionDto) {
        this.fechaModificacionDto = fechaModificacionDto;
    }

    @Override
    public String toString() {
        return "ProductoDto{" + "cdProductoDto=" + cdProductoDto + ", nombreProductoDto=" + nombreProductoDto + ", descripcionProductoDto=" + descripcionProductoDto + ", imagenProductoDto=" + imagenProductoDto + ", cantidadDto=" + cantidadDto + ", precioDto=" + precioDto + ", fechaCreacionDto=" + fechaCreacionDto + ", usuarioCreacionDto=" + usuarioCreacionDto + ", usuarioModificacionDto=" + usuarioModificacionDto + ", fechaModificacionDto=" + fechaModificacionDto + '}';
    }

    
}
