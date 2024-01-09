/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qaswatech.testportal.controller;

import com.qaswatech.testportal.model.CandidateModel;
import com.qaswatech.testportal.service.CandidateService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hp
 */
@WebServlet(name = "CandidateController", urlPatterns = {"/CandidateController"})
public class CandidateController extends HttpServlet {
    String message = null;

     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        String action= request.getParameter("action");
        switch(action){
            case "insert":
                insertcandidate(request,response);
                break;
                
                case "update":
                    UpdateCandidate(request,response);
                    break;
                case "delete":
                    DeleteCandidate(request,response);
                    break;
                    case "login":
                        LoginCandidate(request,response);
                        break;
                        case "logout":
                            response.sendRedirect("index.jsp?msg=logout successfull");
                            break;
                 
            
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CandidateController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CandidateController.class.getName()).log(Level.SEVERE, null, ex);
        }
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

    private void insertcandidate(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        CandidateModel cm = new CandidateModel();
        cm.setName(request.getParameter("cname"));
        cm.setPhone(request.getParameter("phone"));
        cm.setEmail(request.getParameter("email"));
        cm.setCollege(request.getParameter("college"));
        cm.setAddress(request.getParameter("address"));
        cm.setDegree(request.getParameter("degree"));
        cm.setSemester(request.getParameter("semester"));
        cm.setFees(Integer.parseInt(request.getParameter("fees")));
        cm.setCity(request.getParameter("city"));
        cm.setState(request.getParameter("state"));
        
        CandidateService cs = new CandidateService();
        message = cs.insertcandidate(cm);
        response.sendRedirect("insertcandidate.jsp?msg="+message);
        
    }
        public ArrayList<CandidateModel> selectAll() throws SQLException{
            CandidateService cs = new CandidateService();
            return cs.selectAll();
        }
        public CandidateModel selectById(int id){
            CandidateService cs = new CandidateService();
            return cs.selectById(id);
        }

    private void UpdateCandidate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        CandidateModel cm = new CandidateModel();
        cm.setId(Integer.parseInt(request.getParameter("id")));
        cm.setName(request.getParameter("cname"));
        cm.setPhone(request.getParameter("phone"));
        cm.setEmail(request.getParameter("email"));
        cm.setCollege(request.getParameter("college"));
        cm.setAddress(request.getParameter("address"));
        cm.setDegree(request.getParameter("degree"));
        cm.setSemester(request.getParameter("semester"));
        cm.setFees(Integer.parseInt(request.getParameter("fees")));
        cm.setCity(request.getParameter("city"));
        cm.setState(request.getParameter("state"));
        
        
        
        
        CandidateService cs = new CandidateService();
        message = cs.UpdateCandidate(cm);
        response.sendRedirect("showcandidate.jsp?msg=" + message);
    }

    private void DeleteCandidate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        CandidateService cs = new CandidateService();
        message = cs.DeleteCandidate(id);
        response.sendRedirect("showcandidate.jsp?msg=" + message );
    }

    private void LoginCandidate(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        String phone =request.getParameter("phone");
        String password=request.getParameter("password");
        
        CandidateService cs = new CandidateService();
        int status =cs.login(phone , password);
        if(status==1){
            response.sendRedirect("home.jsp?msg=login successfully");
        }else{
            response.sendRedirect("index.jsp?msg= Incorrect Credentials");
            
        }
    }
        
           
}
    
