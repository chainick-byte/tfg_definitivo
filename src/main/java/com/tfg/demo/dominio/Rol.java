/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.demo.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author igorr
 */
@Entity
@Table(name = "rol")
public class Rol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cd_rol")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String cd_rol;

    @Column
    private String ds_rol;

    public String getCd_rol() {
        return cd_rol;
    }

    public void setCd_rol(String cd_rol) {
        this.cd_rol = cd_rol;
    }

    public String getDs_rol() {
        return ds_rol;
    }

    public void setDs_rol(String ds_rol) {
        this.ds_rol = ds_rol;
    }

}
