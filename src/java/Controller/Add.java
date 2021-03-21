/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.Patient;
import Models.PatientDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jayani
 */
@WebServlet(name = "Add", urlPatterns = {"/Add"})
public class Add extends HttpServlet {

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
        PrintWriter out=response.getWriter();
        try{
        String pname=request.getParameter("pname");
        String pid=request.getParameter("pid");
        String did=request.getParameter("did");
        String pno=request.getParameter("pno");
        String type=request.getParameter("type");
        String date=request.getParameter("date");
        String time=request.getParameter("time");
        
        Patient e=new Patient();
        
        e.setPname(pname);
        e.setPid(pid);
        e.setDid(did);
        e.setPno(pno);
        e.setType(type);
        e.setDate(date);
        e.setTime(time);
        
         int status=PatientDB.registerUser(e);
        
        if(status>0){
            out.print("<p>Record saved successfully</p>");
            request.getRequestDispatcher("labApo").include(request,response);
        }else{
            out.println("Sorry!unable to save record");
        }
      
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
          out.close(); 
        
        
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
