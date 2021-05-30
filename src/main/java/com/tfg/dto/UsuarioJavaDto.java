/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tfg.dto;

import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author igorr
 */
public class UsuarioJavaDto implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(UsuarioJavaDto.class);
    
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String nickname;
    private String contrasenha_1;
    private String contrasenha_2;
    private int telefono;
    private String email;

    public UsuarioJavaDto() {
    }

    public UsuarioJavaDto(String nombre, String primerApellido, String segundoApellido, String nickname, String contrasenha_1, String contrasenha_2, int telefono,String email) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.nickname = nickname;
        this.contrasenha_1 = contrasenha_1;
        this.contrasenha_2 = contrasenha_2;
        this.telefono = telefono;
        this.email=email;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContrasenha_1() {
        return contrasenha_1;
    }

    public void setContrasenha_1(String contrasenha_1) {
        this.contrasenha_1 = contrasenha_1;
    }

    public String getContrasenha_2() {
        return contrasenha_2;
    }

    public void setContrasenha_2(String contrasenha_2) {
        this.contrasenha_2 = contrasenha_2;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return contrasenha_1 + "UsuarioJavaDto{" + "nombre=" + nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", nickname=" + nickname + ", contrasenha_1=" + ", contrasenha_2=" + contrasenha_2 + ", telefono=" + telefono +", email=" + email +'}';
    }
    
    
}
