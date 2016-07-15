/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGEME.pruebas;

import SIGEME.model.FormAdmin;
import SIGEME.model.FormInfo;
import SIGEME.model.Model;
import SIGEME.model.Trabajador;
import SIGEME.model.Usuario;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

/**
 *
 * @author a25salas
 */
public class NewClass {
    
    public static void main (String [ ] args) throws Exception {
    // Usuario usuario = new Usuario("001","001",0);
   
    Trabajador t= new Trabajador("003","eugenia","a",new Date(System.currentTimeMillis()),"a","a","a","a",new Date(System.currentTimeMillis()));
     FormAdmin f= new FormAdmin(111,"a",new Date(System.currentTimeMillis()),t,new Date(System.currentTimeMillis()));
     FormInfo f1= new FormInfo(321,"oscar", "aa", new Date(System.currentTimeMillis()), "111","aa", "Masculino", "Costarricense");

//Model.userLogin(usuario);
    
    System.out.print(Model.obtenerCantidadHombres(10,2016));
    } //Cierre del main
    
    
}
