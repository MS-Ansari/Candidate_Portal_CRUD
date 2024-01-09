<%-- 
    Document   : ViewCandidate
    Created on : Jun 20, 2023, 11:26:04 AM
    Author     : Hp
--%>

<%@page import="com.qaswatech.testportal.model.CandidateModel"%>
<%@page import="com.qaswatech.testportal.controller.CandidateController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
                           <!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Details</title>
    </head>
    <body>
        <h1>Candidate Details</h1>
        <% 
            int id = Integer.parseInt(request.getParameter("id"));
            CandidateController cc = new CandidateController();
            CandidateModel candidate = cc.selectById(id);
            System.out.println("id" + candidate.getId());
        %>
            
        <table class="table table-light">
            <tr>
                <td>Name</td>
                <td><%= candidate.getName() %></td>
            </tr>
            
            <tr>
                <td>Phone</td>
                <td><%= candidate.getPhone() %></td>
            </tr>
            
            <tr>
                <td>Email</td>
                <td><%= candidate.getEmail() %></td>
            </tr>
            
            <tr>
                
                <td>College</td>
                <td> <%= candidate.getCollege() %> </td>
            </tr>
            <tr>
                
                <td>Address</td>
                <td><%= candidate.getAddress() %></td>
            </tr>
            <tr>
                
                <td>Degree</td>
                <td><%= candidate.getDegree() %></td>
            </tr>
            <tr>
                
                <td>Semester</td>
                <td><%= candidate.getSemester() %></td>
            </tr>
            <tr>
                
                <td>Fees</td>
                <td><%= candidate.getFees() %></td>
            </tr>
            <tr>
                
                <td>City</td>
                <td><%= candidate.getCity() %></td>
            </tr>
            <tr>
                
                <td>State</td>
                <td><%= candidate.getState() %></td>
            </tr>
            
            <tr>
                <td>Joining date</td>
                <td> <%= candidate.getCreatedAt()%></td>
            </tr>
           
            
            
            
            
            
            
        </table>
            <a href="showcandidate.jsp" class="btn btn-outline-success" >Back</a>
    
    
    </body>
    
    
</html>
