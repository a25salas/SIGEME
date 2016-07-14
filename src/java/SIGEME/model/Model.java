/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGEME.model;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import SIGEME.database.Database;
import java.util.LinkedList;


import java.util.List;



/**
 *
 * @author a25salas
 */
public class Model{
    static Database db;
    
      static {
        initdb();
    }
    private static void initdb(){
       db= new Database(null, null, null);        
    }
    
    // metodos Usuarios
          
      public static void addUser(Usuario p) throws Exception{
           String sql= "insert into Usuarios(id,clave,tipo)"+
                    "values('%s','%s','%s')";
       sql= String.format(sql, p.getId(),p.getClave(),p.getTipo());
       int count= db.executeUpdate(sql);
       if(count== 0){
       throw new Exception("Cliente ya existe");
       }  
      }
      
        public static Usuario getUser(String id) throws Exception {
             String sql="select * from "+
            "Usuarios  c  "+
            "where c.id = '%s'";
    sql=String.format(sql,id);
    ResultSet rs =  db.executeQuery(sql);
    if (rs.next()) {
        return toUser(rs);
    }
    else{
       return null;
    }
    }


    public static Usuario userLogin(Usuario usuario) throws Exception {
      try {
            String sql="select * from "+
                    "Usuarios  u  "+
                    "where u.id = '%s' and u.clave='%s'";
            sql=String.format(sql,usuario.id,usuario.clave);
            
            ResultSet rs =  db.executeQuery(sql);
            if (rs.next()) {
                return toUser(rs);
            }
            else{
                return new Usuario(usuario.id,usuario.clave,0);
            }
        } catch (SQLException ex) {
        }
        return null;
    }
    
      private static Usuario toUser(ResultSet rs) throws Exception{
        Usuario obj= new Usuario();
        obj.setId(rs.getString("id"));
        obj.setClave(rs.getString("clave"));
        obj.setTipo(rs.getInt("tipo"));
        return obj;
    }
    
      
  
      
    // metodos Trabajadores
      
          public static List<Trabajador> trabajadoresListAll() throws Exception{
                 List<Trabajador> resul;
       resul= new ArrayList();
        try {
            String sql="select * "+
                    "from Trabajadores  t  ";
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                resul.add(toTrabajador(rs));
            }
        } catch (SQLException ex) {
        }
       return resul;
          
          }
          
            public static List<Trabajador> TrabajadoresSearch(String criteria) throws Exception{
       List<Trabajador> prods;
       prods= new ArrayList();
        try {
            String sql="select * from "+
                    "Trabajadores  p  "+
                    "where p.cedula like '%%%s%%'";
            sql=String.format(sql,criteria);
            
            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                prods.add(toTrabajador(rs));
            }
        } catch (SQLException ex) {
        }
       return prods;
   }
          
      private static Trabajador toTrabajador(ResultSet rs) throws Exception{
        Trabajador obj= new Trabajador();
        obj.setCedula(rs.getString("cedula"));
        obj.setNombre(rs.getString("nombre"));
        obj.setEmail(rs.getString("email"));
        obj.setFechaNacimiento(rs.getDate("fechaNacimiento"));
        obj.setTelefono(rs.getString("telefono"));
        obj.setPuesto(rs.getString("puesto"));
        String resul= "F".equals(rs.getString("sexo"))?"Femenino":"Masculino";
        obj.setSexo(resul);
        obj.setProfesion(rs.getString("profesion"));
        obj.setFechaIngreso(rs.getDate("fechaIngreso"));
        
        return obj;
    }

    public static int addTrabajador(Trabajador p) {
         String sql= "insert into Trabajadores(cedula,nombre,fechaNacimiento,telefono,email,sexo,profesion,fechaIngreso,puesto)"+
                    "values ('%s','%s','%s','%s','%s','%s','%s','%s','%s')";
       sql= String.format(sql, p.getCedula(),p.getNombre(),new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaNacimiento()),p.getTelefono(),
               p.getEmail(),"Masculino".equals(p.getSexo())?"M":"F",p.getProfesion(),new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaIngreso()),p.getPuesto());
       int count= db.executeUpdate(sql);
       
       if(count==0) return 0; // fallo esta repetido
       else return 1; // exitoso
    }
    
    public static int updateTrabajador(Trabajador p)throws Exception
{
String sql="update Trabajadores set nombre='%s',fechaNacimiento='%s',"
        +"telefono='%s',email='%s', sexo= '%s', profesion= '%s', fechaIngreso= '%s', puesto= '%s' where cedula='%s'";
 sql= String.format(sql,p.getNombre(),new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaNacimiento()),p.getTelefono(),
               p.getEmail(),"Masculino".equals(p.getSexo())?"M":"F",p.getProfesion(),new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaIngreso()),p.getPuesto(), p.getCedula());
int count= db.executeUpdate(sql);
     return count;

}

    public static int deleteTrabajador(Trabajador trabajador) {
       String sql="delete from Trabajadores where cedula='%s'";
       sql= String.format(sql,trabajador.getCedula());
System.out.println(sql);
int count= db.executeUpdate(sql);
     return count; 
    }

    public static Trabajador TrabajadorGet(String id) throws SQLException, Exception {
              String sql="select * from "+
            "Trabajadores  c  "+
            "where c.cedula = '%s'";
    sql=String.format(sql,id);
    ResultSet rs =  db.executeQuery(sql);
    if (rs.next()) {
        return toTrabajador(rs);
    }
    else{
       return null;
    }
    }

    // FormAdmin
    
    public static int addFormAdmin(FormAdmin p) {
            String sql= "insert into Form_administrativos(numero_expediente,nombre,fecha_asignacion,cedula_trabajador,fechaEntrega)"+
                    "values (%s,'%s','%s','%s','%s')";
       sql= String.format(sql, p.getExpediente(),p.getNombre(),new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaAsignacion()),p.getTrabajador().getCedula(),
               new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaAsignacion()));
       int count= db.executeUpdate(sql);
       
       if(count==0) return 0; // fallo esta repetido
       else return 1; // exitoso

    }

    public static List<FormAdmin> formAdminSearch(String criteria) throws Exception {
            List<FormAdmin> prods;
       prods= new ArrayList();
        try {
            String sql="select * from "+
                    "Form_administrativos  p  "+
                    "where CONVERT( p.numero_expediente , CHAR(16)) like '%%%s%%'";
            sql=String.format(sql,criteria);

            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                prods.add(toFormAdmin(rs));
            }
        } catch (SQLException ex) {
        }
       return prods;
    }
    
    public static List<FormAdmin> formAdminSearchSession(String criteria, String id) throws Exception {
               List<FormAdmin> prods;
       prods= new ArrayList();
        try {
            String sql="select * from "+
                    "Form_administrativos  p  "+
                    "where CONVERT( p.numero_expediente , CHAR(16)) like '%%%s%%' and p.cedula_trabajador='%s'";
            sql=String.format(sql,criteria,id);

            ResultSet rs =  db.executeQuery(sql);
            while (rs.next()) {
                prods.add(toFormAdmin(rs));
            }
        } catch (SQLException ex) {
        }
       return prods;
    }
    
       private static FormAdmin toFormAdmin(ResultSet rs) throws Exception{
        FormAdmin obj= new FormAdmin();
        obj.setExpediente(Integer.decode(rs.getString("numero_expediente")));
        obj.setNombre(rs.getString("nombre"));
        obj.setFechaAsignacion(rs.getDate("fecha_asignacion"));
        obj.setTrabajador(TrabajadorGet(rs.getString("cedula_trabajador")));
        obj.setFechaEntrega(rs.getDate("fechaEntrega"));
     
        return obj;
    }

    public static int updateFormAdmin(FormAdmin p) {
     String sql="update Form_administrativos set nombre='%s',fecha_asignacion='%s',"
        +"cedula_trabajador='%s',fechaEntrega='%s' where numero_expediente= %s";
 sql= String.format(sql,p.getNombre(),new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaAsignacion()),p.getTrabajador().getCedula(),
               new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaAsignacion()),p.getExpediente());
 //System.out.println(sql);
int count= db.executeUpdate(sql);
     return count;  

    }

    //FORM_info
    
    public static FormInfo formInfoGet(String criteria) throws SQLException {
            String sql="select * from "+
            "Form_info_personal  c  "+
            "where c.numero_expediente = %s";
    sql=String.format(sql,criteria);
    ResultSet rs =  db.executeQuery(sql);
    if (rs.next()) {
        return toFormInfo(rs);
    }
    else{
       return null;
    }   
    }

    public static int updateFormInfo(FormInfo p) {
         String sql="update Form_info_personal set cedula='%s',fecha_nacimiento='%s',"
        +"sexo='%s',telefono='%s',nombre_encargado='%s',cedula_encargado='%s', nacionalidad='%s' where numero_expediente= %s";
 sql= String.format(sql,p.getCedula(),new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaNacimiento()),"Masculino".equals(p.getSexo())?"M":"F",
               p.getTelefono(),p.getNombreEncargado(),p.getCedulaEncargado(),p.getNacionalidad(),p.getExpediente());
// System.out.println(sql);
int count= db.executeUpdate(sql);
     return count;  
    }

    private static FormInfo toFormInfo(ResultSet rs) throws SQLException {
        FormInfo obj= new FormInfo();
        obj.setExpediente(Integer.decode(rs.getString("numero_expediente")));
        obj.setCedula(rs.getString("cedula"));
        obj.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
         String resul= "F".equals(rs.getString("sexo"))?"Femenino":"Masculino";
        obj.setSexo(resul);
        obj.setTelefono(rs.getString("telefono"));
        obj.setNombreEncargado(rs.getString("nombre_encargado"));
        obj.setCedulaEncargado(rs.getString("cedula_encargado"));
        obj.setNacionalidad(rs.getString("nacionalidad"));
     
        return obj;
    }

    // CALENDARIO
    
        public static int addCalendarDTO(CalendarDTO p) {
      String sql= "insert into events(title,description,color,date)"+
                    "values('%s','%s','%s','%s')";
       sql= String.format(sql,p.getTitle(),p.getDescripcion(),p.getColor(),p.getDate());
       int count= db.executeUpdate(sql);
       return count;    
    }
    
    public static int updateCalendarDTO(CalendarDTO p) {
      String sql= "update events set title='%s',description='%s',color='%s',date='%s' where id= %s";
       sql= String.format(sql,p.getTitle(),p.getDescripcion(),p.getColor(),p.getDate(), p.getId());
       int count= db.executeUpdate(sql);
       return count;    
    }
    
    public static int deleteCalendarDTO(CalendarDTO p) {
      String sql= "delete from events where id= %s";
       sql= String.format(sql,p.getId());
       int count= db.executeUpdate(sql);
       return count;    
    }
    
           public static LinkedList getEventos() throws Exception{
        LinkedList<CalendarDTO> resultado;
         resultado = new LinkedList<>();
        try{
        String sql = "select * from events where idTrabajador='general'";
        ResultSet rs= db.executeQuery(sql);
        while(rs.next()){
        resultado.add(toCalendarDTO(rs));}        
        
        }catch(SQLException ex){
        
        }
        return resultado;
   
        }  
           
               public static LinkedList getEventosId(String ced) throws Exception{
        LinkedList<CalendarDTO> resultado;
         resultado = new LinkedList<>();
        try{
        String sql = "select * from events a where a.idTrabajador='%s'";
         sql= String.format(sql,ced);
        ResultSet rs= db.executeQuery(sql);
        while(rs.next()){
        resultado.add(toCalendarDTO(rs));}        
        
        }catch(SQLException ex){
        
        }
        return resultado;
   
        }  
           
             private static CalendarDTO toCalendarDTO(ResultSet rs) throws Exception{
        CalendarDTO obj= new CalendarDTO();
        obj.setId(rs.getInt("id"));
        obj.setTitle(rs.getString("title"));
        obj.setDescripcion(rs.getString("description"));
        obj.setColor(rs.getString("color"));
        obj.setDate(rs.getString("date"));
        
        return obj;
    }
             
      // graficos

    public static Float obtenerCantidad(int mes, int ano) throws SQLException {
String sql= "   SELECT COUNT(numero_expediente) canti from Form_administrativos where month(fecha_asignacion)=  %s and\n" +
"                                                year(fecha_asignacion) = %s";
        sql= String.format(sql,mes,ano);
        ResultSet rs= db.executeQuery(sql);
        float resultado= 0;
        rs.next();
        resultado= rs.getFloat("canti") ;      
        return resultado;

    }

    public static int updateUser(Usuario p) {
String sql="update Usuarios set clave='%s', tipo= '%s' where id='%s'";
 sql= String.format(sql,p.getClave(),p.getTipo(), p.getId());
int count= db.executeUpdate(sql);
     return count;    
    }

  
             
       
    

  

 

}
