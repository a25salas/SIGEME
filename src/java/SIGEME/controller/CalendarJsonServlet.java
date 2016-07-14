/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIGEME.controller;


import SIGEME.model.CalendarDTO;
import SIGEME.model.Jsonable;
import SIGEME.model.Model;
import SIGEME.model.Trabajador;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a25salas
 */
@WebServlet(name = "CalendarJsonServlet", urlPatterns = {"/CalendarJsonServlet"})
public class CalendarJsonServlet extends HttpServlet {

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
           response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/xml");
        RuntimeTypeAdapterFactory<Jsonable> rta = RuntimeTypeAdapterFactory.of(Jsonable.class,"_class")
                  .registerSubtype(CalendarDTO.class,"CalendarDTO");
              
            Gson gson = new GsonBuilder().registerTypeAdapterFactory(rta).setDateFormat("dd/MM/yyyy").create();
            String json;
            List<CalendarDTO> l;
            String accion = request.getParameter("action");
                  CalendarDTO cal;
               
            
            switch (accion) {
                
                 case "addEvent":
                   json = request.getParameter("calendar");
                    cal= gson.fromJson(json, CalendarDTO.class);
                    int resultad= Model.addCalendarDTO(cal);
                     json= gson.toJson(resultad);
                    out.write(json);
                    break;
                  case "updateEvent":

                      json = request.getParameter("calendar");
                    cal= gson.fromJson(json, CalendarDTO.class);
                    int resultado= Model.updateCalendarDTO(cal);
                     json= gson.toJson(resultado);
                    out.write(json);
                    break;
                     case "deleteEvent":

                      json = request.getParameter("calendar");
                    cal= gson.fromJson(json, CalendarDTO.class);
                    int resultado2= Model.deleteCalendarDTO(cal);
                     json= gson.toJson(resultado2);
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
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  response.setContentType("text/html;charset=UTF-8");
           response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/xml");
        RuntimeTypeAdapterFactory<Jsonable> rta = RuntimeTypeAdapterFactory.of(Jsonable.class,"_class")
                  .registerSubtype(CalendarDTO.class,"CalendarDTO");
              
            Gson gson = new Gson();
            String json;
            List<CalendarDTO> l;
            String accion = request.getParameter("action");
           
               
            
            switch (accion) {
                
               
           
                case "getEvents":
                    l = new LinkedList<>();
                     l= Model.getEventos();
                    json= gson.toJson(l);
                    out.write(json);
                    break;
                case "getEventsId":
                    l = new LinkedList<>();
                 String id= ( (Trabajador) request.getSession().getAttribute("trabajador")).getCedula();
                     l= Model.getEventosId(id);
                    json= gson.toJson(l);
                    out.write(json);
                    break;
                 
                    

            }
        } catch (Exception e) {
            System.out.println(e);
        }
       
       /*List<CalendarDTO> l;
        l = new LinkedList<>();
   RuntimeTypeAdapterFactory<Jsonable> rta = RuntimeTypeAdapterFactory.of(Jsonable.class,"_class")
             .registerSubtype(Usuario.class,"Usuario")
             .registerSubtype(Cliente.class,"Cliente")
              .registerSubtype(Apartado.class,"Apartado")
              .registerSubtype(CalendarDTO.class,"CalendarDTO")
             .registerSubtype(Trabajador.class,"Trabajador");
       Gson gson = new GsonBuilder().registerTypeAdapterFactory(rta).setDateFormat("dd/MM/yyyy").create();
        String json;
 
 CalendarDTO c = new CalendarDTO();
 c.setId(1);
 c.setStart("2016-07-29");
 c.setEnd("2016-07-29");
 c.setTitle("hola");
  l.add(c);
  
  
CalendarDTO d = new CalendarDTO();
 d.setId(2);
 d.setStart("2016-07-26");
 d.setEnd("2016-07-28");
 d.setTitle("hola2");
 l.add(d);

 CalendarDTO t = new CalendarDTO();
 t.setId(3);
 t.setStart("2016-08-26");
 t.setEnd("2016-08-28");
 t.setTitle("hola3");
 

l.add(t);

 response.setContentType("application/json");
 response.setCharacterEncoding("UTF-8");
 PrintWriter out = response.getWriter();
 json= gson.toJson(l);
 out.write(json);*/
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
