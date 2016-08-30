/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGEME.model;

/**
 *
 * @author Andres
 */
public class Form_datos_laborales {
     private Integer expediente;
 private 	String estadoDeTrabajo ;
  private String ocupacion ;
   private Boolean esTrabajoFamiliar ;
private 	String tareas ;
private	String tipoTrabajo ;
    private String criterioTipoTrabajo ;
private 	Boolean esRemunerado;
   private Float salario ;
private 	String jornadaDiaria ;
   private Integer cantidadDias; 
private 	String derechosLaborales; 

    public Form_datos_laborales(Integer expediente, String estadoDeTrabajo, String ocupacion, Boolean esTrabajoFamiliar, String tareas, String tipoTrabajo, String criterioTipoTrabajo, Boolean esRemunerado, Float salario, String jornadaDiaria, Integer cantidadDias, String derechosLaborales) {
        this.expediente = expediente;
        this.estadoDeTrabajo = estadoDeTrabajo;
        this.ocupacion = ocupacion;
        this.esTrabajoFamiliar = esTrabajoFamiliar;
        this.tareas = tareas;
        this.tipoTrabajo = tipoTrabajo;
        this.criterioTipoTrabajo = criterioTipoTrabajo;
        this.esRemunerado = esRemunerado;
        this.salario = salario;
        this.jornadaDiaria = jornadaDiaria;
        this.cantidadDias = cantidadDias;
        this.derechosLaborales = derechosLaborales;
    }

    @Override
    public String toString() {
        return "Form_datos_laborales{" + "numero_expediente=" + expediente + ", estadoDeTrabajo=" + estadoDeTrabajo + ", ocupacion=" + ocupacion + ", esTrabajoFamiliar=" + esTrabajoFamiliar + ", tareas=" + tareas + ", tipoTrabajo=" + tipoTrabajo + ", criterioTipoTrabajo=" + criterioTipoTrabajo + ", esRemunerado=" + esRemunerado + ", salario=" + salario + ", jornadaDiaria=" + jornadaDiaria + ", cantidadDias=" + cantidadDias + ", derechosLaborales=" + derechosLaborales + '}';
    }
    
    
}
