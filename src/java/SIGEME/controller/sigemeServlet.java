/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGEME.controller;

import SIGEME.model.FormAdmin;
import SIGEME.model.FormInfo;
import SIGEME.model.Jsonable;
import SIGEME.model.Model;
import SIGEME.model.Trabajador;
import SIGEME.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import java.util.LinkedList;
/**
 *
 * @author a25salas
 */
@WebServlet(name = "sigemeServlet", urlPatterns = {"/sigemeServlet"})
public class sigemeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/xml");
        RuntimeTypeAdapterFactory<Jsonable> rta = RuntimeTypeAdapterFactory.of(Jsonable.class,"_class")
             .registerSubtype(Usuario.class,"Usuario")
             .registerSubtype(FormAdmin.class,"FormAdmin")
             .registerSubtype(Trabajador.class,"Trabajador")
             .registerSubtype(FormInfo.class,"FormInfo");
              
            Gson gson = new GsonBuilder().registerTypeAdapterFactory(rta).setDateFormat("dd/MM/yyyy").create();
            String json;
            String accion = request.getParameter("action");
             String criteria;
            //trabajadores
            List<Trabajador> trabajadores;
             Trabajador trabajador;
             Usuario user;
             // formAdmin
              List<FormAdmin> formAdmins;
               FormAdmin formAdmin;
               FormInfo formInfo;
               
                      //graficos
             List<Float> ganancias= new LinkedList<>();
               
            
            switch (accion) {
           
                 // aspectos relativos a la sesion y usuarios
                case "userLogin":
                    json = request.getParameter("user");

                     user = gson.fromJson(json, Usuario.class);
                    user = Model.userLogin(user);
                    if (user.getTipo() != 0) {
                        request.getSession().setAttribute("user", user);
                        switch (user.getTipo()) {
                            case 1:

                                trabajador = Model.TrabajadorGet(user.getId());
                                request.getSession().setAttribute("trabajador", trabajador);

                                break;
                            case 2:
                       
                                trabajador = Model.TrabajadorGet(user.getId());
                                request.getSession().setAttribute("trabajador", trabajador);
                                break;
                            case 3: 
                                
                                trabajador = Model.TrabajadorGet(user.getId());
                                request.getSession().setAttribute("trabajador", trabajador);
                                break;

                        }
                    }
                    json = gson.toJson(user);
                    out.write(json);
                    break;
                case "userLogout":
                    request.getSession().removeAttribute("user");
                    request.getSession().invalidate();
                    break;

              
                case "addUser":
                    json = request.getParameter("user");
           
                    user = gson.fromJson(json, Usuario.class);
                    Model.addUser(user);
                    //out.write("1");
                    break;
                    
                 case "getUser":
                    json = request.getParameter("user");
                    user =   Model.getUser(json);
                    json = gson.toJson(user, Usuario.class);
                    out.write(json);
                    break;
          
                case "userGet": // pero el usuario en sesion
                    Usuario user1 = (Usuario) request.getSession().getAttribute("user");
                    json = gson.toJson(user1);
                    out.write(json);
                    break;
                    
                 case "updateUser":
                    json = request.getParameter("user");
                    user= gson.fromJson(json, Usuario.class);
                    int resultaaa= Model.updateUser(user);
                     json= gson.toJson(resultaaa);
                    out.write(json);
                    break;
                
                    // trabajadores
                case "TrabajadoresListAll":
                    trabajadores= Model.trabajadoresListAll();
                    json= gson.toJson(trabajadores);
                    out.write(json);
                    break;
                    
                case "TrabajadoresSearch":
                 
                    criteria = request.getParameter("criteria");
                    trabajadores = Model.TrabajadoresSearch(criteria);
                    json = gson.toJson(trabajadores); 
                    out.write(json);
                    break;
                    
                 case "addTrabajador":
                    
                    json = request.getParameter("trabajador");
                    trabajador= gson.fromJson(json, Trabajador.class);
                    int resul= Model.addTrabajador(trabajador);
                     json= gson.toJson(resul);
                    out.write(json);
                    break;
                    
                     case "updateTrabajador":
                    json = request.getParameter("trabajador");
                    trabajador= gson.fromJson(json, Trabajador.class);
                    int resul2= Model.updateTrabajador(trabajador);
                     json= gson.toJson(resul2);
                    out.write(json);
                    break;
                    
                     case "deleteTrabajador":
                    json = request.getParameter("trabajador");
                    trabajador= gson.fromJson(json, Trabajador.class);
                    int resul3= Model.deleteTrabajador(trabajador);
                     json= gson.toJson(resul3);
                    out.write(json);
                    break;
                    
                    // FormAdmin
                       case "formAdminSearch":
                    criteria = request.getParameter("criteria");
                    formAdmins = Model.formAdminSearch(criteria);
                    json = gson.toJson(formAdmins); 
                    out.write(json);
                    break;
                    
                      case "formAdminSearchSession":
                    criteria = request.getParameter("criteria");
                    formAdmins = Model.formAdminSearchSession(criteria,( (Trabajador) request.getSession().getAttribute("trabajador")).getCedula());
                    json = gson.toJson(formAdmins); 
                    out.write(json);
                    break;
                    
                 case "addFormAdmin":
                    
                    json = request.getParameter("formAdmin");
                    formAdmin= gson.fromJson(json, FormAdmin.class);
                    int result= Model.addFormAdmin(formAdmin);
                     json= gson.toJson(result);
                    out.write(json);
                    break;
                    
                   case "updateFormAdmin":
                    
                    json = request.getParameter("formAdmin");
                    formAdmin= gson.fromJson(json, FormAdmin.class);
                    int resulta= Model.updateFormAdmin(formAdmin);
                     json= gson.toJson(resulta);
                    out.write(json);
                    break;
                     
                    // FormInfo
                       case "formInfoGet":
                    criteria = request.getParameter("criteria");
                    formInfo = Model.formInfoGet(criteria);
                    json = gson.toJson(formInfo); 
                    out.write(json);
                    break;
                    
                       case "updateFormInfo":
                     json = request.getParameter("formInfo");
                    formInfo= gson.fromJson(json, FormInfo.class);
                    int resultad= Model.updateFormInfo(formInfo);
                     json= gson.toJson(resultad);
                    out.write(json);
                    break;
                    
                       case "listaCantidad":
                            for(float i=1; i<=12;i++){
                     ganancias.add(i);
                     ganancias.add(Model.obtenerCantidad((int) i, 2016));
                     }
                     json= gson.toJson(ganancias);
                     out.write(json);
                     break;

            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
