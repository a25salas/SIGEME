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
public class FormAdmin implements Serializable, SIGEME.model.Jsonable  {

    public FormAdmin(Integer expediente, String nombre, Date fechaAsignacion, Trabajador trabajador, Date fechaEntrega) {
        this.expediente = expediente;
        this.nombre = nombre;
        this.fechaAsignacion = fechaAsignacion;
        this.trabajador = trabajador;
        this.fechaEntrega = fechaEntrega;
    }

    public FormAdmin() {
        this.expediente = 0;
        this.nombre = "";
        this.fechaAsignacion = null;
        this.trabajador = null;
        this.fechaEntrega = null;
        
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
    
    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private Date fechaAsignacion;

    /**
     * Get the value of fechaAsignacion
     *
     * @return the value of fechaAsignacion
     */
    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    /**
     * Set the value of fechaAsignacion
     *
     * @param fechaAsignacion new value of fechaAsignacion
     */
    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    private Trabajador trabajador;

    /**
     * Get the value of trabajador
     *
     * @return the value of trabajador
     */
    public Trabajador getTrabajador() {
        return trabajador;
    }

    /**
     * Set the value of trabajador
     *
     * @param trabajador new value of trabajador
     */
    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    private Date fechaEntrega;

    /**
     * Get the value of fechaEntrega
     *
     * @return the value of fechaEntrega
     */
    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Set the value of fechaEntrega
     *
     * @param fechaEntrega new value of fechaEntrega
     */
    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "FormAdmin{" + "expediente=" + expediente + ", nombre=" + nombre + ", fechaAsignacion=" + fechaAsignacion + ", trabajador=" + trabajador + ", fechaEntrega=" + fechaEntrega + '}';
    }

    
    
}
