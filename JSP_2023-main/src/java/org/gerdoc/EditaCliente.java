/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package org.gerdoc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sebas
 */
@WebServlet(name = "EditaCliente", urlPatterns = {"/EditaCliente"})
public class EditaCliente extends HttpServlet {

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
        String accion = null;
        try (PrintWriter out = response.getWriter()) {
           out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">");
            out.println("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>");            
            out.println("<title>Servlet AgregaCliente</title>");            
            out.println("</head>");
            out.println("<body>");
            accion = request.getParameter("guardar" );
            if(accion != null && "Guardar".equals(accion) )
            {
                editaCliente( request );
            }
            else
            {
                imprimirFormulario( out );
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
            public void editaCliente(HttpServletRequest request) {
        Cliente clientesillo = new Cliente();
        List<Cliente>list = null;
        clientesillo.setNombre(request.getParameter("nombre"));
        
    }
        public void imprimirFormulario( PrintWriter out)
    {
        Cliente clientesillo = new Cliente();
        List<Cliente>list = null;   
        
        out.println("<form id=\"form1\">");
        out.println("<table border=\"1\">");
        out.println("<tr>");
        out.println("<td>Nombre &emsp;</td><td>");
        out.println("<input id=\"nombre\" name=\"nombre\" type=\"text\" value=\"  " + "AYUDA NO SE COMO HACERLE AQUI" + "\"/>");
        out.println("</td>");
        out.println("<t r>");
        out.println("<td>Apellido Paterno &emsp;</td><td>");
        out.println("<input id=\"apellidoP\" name=\"apellidoP\" type=\"text\" />");
        out.println("</td>");
        out.println("<tr>");
        out.println("<td>Apellido Materno &emsp;</td><td>");
        out.println("<input id=\"apellidoM\" name=\"apellidoM\" type=\"text\" />");
        out.println("</td>");
        out.println("<tr>");
        out.println("<td>Edad </td><td>");
        out.println("<input id=\"edad\" name=\"edad\" type=\"number\" />");
        out.println("</td>");
        out.println("<tr>");
        out.println("<td colspan=\"2\"><input id=\"guardar\" name=\"guardar\" value=\"Guardar\"  type=\"submit\" /></td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</form>");           
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
