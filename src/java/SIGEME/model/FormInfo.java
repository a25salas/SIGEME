/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGEME.model;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author a25salas
 */
public class FormInfo implements Serializable, SIGEME.model.Jsonable {

    public FormInfo(Integer expediente, String nombreEncargado, String cedula, Date fechaNacimiento, String telefono, String cedulaEncargado, String sexo, String nacionalidad) {
        this.expediente = expediente;
        this.nombreEncargado = nombreEncargado;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.cedulaEncargado = cedulaEncargado;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    public FormInfo() {
          this.expediente = 0;
        this.nombreEncargado = "";
        this.cedula = "";
        this.fechaNacimiento = null;
        this.telefono = "";
        this.cedulaEncargado = "";
        this.sexo = "";
        this.nacionalidad = "";
        
    }
    
    
    private Integer expediente;

    /**
     * Get the value of expediente
     *
     * @return the value of expediente
     */
    public Integer getExpediente() {
        return expediente;
    }

    /**
     * Set the value of expediente
     *
     * @param expediente new value of expediente
     */
    public void setExpediente(Integer expediente) {
        this.expediente = expediente;
    }
    
        private String nombreEncargado;

    /**
     * Get the value of nombreEncargado
     *
     * @return the value of nombreEncargado
     */
    public String getNombreEncargado() {
        return nombreEncargado;
    }

    /**
     * Set the value of nombreEncargado
     *
     * @param nombreEncargado new value of nombreEncargado
     */
    public void setNombreEncargado(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    private String cedula;

    /**
     * Get the value of cedula
     *
     * @return the value of cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Set the value of cedula
     *
     * @param cedula new value of cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    private Date fechaNacimiento;

    /**
     * Get the value of fechaNacimiento
     *
     * @return the value of fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Set the value of fechaNacimiento
     *
     * @param fechaNacimiento new value of fechaNacimiento
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    private String telefono;

    /**
     * Get the value of telefono
     *
     * @return the value of telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Set the value of telefono
     *
     * @param telefono new value of telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String cedulaEncargado;

    /**
     * Get the value of cedulaEncargado
     *
     * @return the value of cedulaEncargado
     */
    public String getCedulaEncargado() {
        return cedulaEncargado;
    }

    /**
     * Set the value of cedulaEncargado
     *
     * @param cedulaEncargado new value of cedulaEncargado
     */
    public void setCedulaEncargado(String cedulaEncargado) {
        this.cedulaEncargado = cedulaEncargado;
    }

    private String sexo;

    /**
     * Get the value of sexo
     *
     * @return the value of sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Set the value of sexo
     *
     * @param sexo new value of sexo
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    private String nacionalidad;

    /**
     * Get the value of nacionalidad
     *
     * @return the value of nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Set the value of nacionalidad
     *
     * @param nacionalidad new value of nacionalidad
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    
}
