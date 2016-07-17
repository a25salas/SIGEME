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
public class Trabajador  implements Serializable, SIGEME.model.Jsonable {

    public Trabajador(String cedula, String nombre, String email, Date fechaNacimiento, String telefono, String puesto, String sexo, String profesion, Date fechaIngreso) {
        this.nombre = nombre;
        this.email = email;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.puesto = puesto;
        this.sexo = sexo;
        this.profesion = profesion;
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", email=" + email + ", cedula=" + cedula + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", puesto=" + puesto + ", sexo=" + sexo + ", profesion=" + profesion + ", fechaIngreso=" + fechaIngreso + '}';
    }




    private String nombre;

    Trabajador() {
               this.nombre = "";
        this.email = "";
        this.cedula = "";
        this.fechaNacimiento = null;
        this.telefono = "";
        this.puesto = "";
        this.sexo = "";
        this.profesion = "";
        this.fechaIngreso = null;
    }

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

    private String email;

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    private String cedula;
    private Date fechaNacimiento;
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

    private String puesto;

    /**
     * Get the value of puesto
     *
     * @return the value of puesto
     */
    public String getPuesto() {
        return puesto;
    }

    /**
     * Set the value of puesto
     *
     * @param puesto new value of puesto
     */
    public void setPuesto(String puesto) {
        this.puesto = puesto;
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

    private String profesion;

    /**
     * Get the value of profesion
     *
     * @return the value of profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * Set the value of profesion
     *
     * @param profesion new value of profesion
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    private Date fechaIngreso;

    /**
     * Get the value of fechaIngreso
     *
     * @return the value of fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Set the value of fechaIngreso
     *
     * @param fechaIngreso new value of fechaIngreso
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

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

    //comentario prueba para Git :b 

}
