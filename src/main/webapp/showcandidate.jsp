<%-- 
    Document   : showcandidate
    Created on : Jun 19, 2023, 12:54:15 PM
    Author     : Hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.qaswatech.testportal.model.CandidateModel"%>
<%@page import="com.qaswatech.testportal.controller.CandidateController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
            <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

    </head>
    <body>
        <h1>Show Candidate</h1>
        <table class="table table-light">
            <tr>
                <th>name</th>
                <th>phone</th>
                <th>email</th>
                <th>college</th>
                <th>address</th>
                <th>degree</th>
                <th>semester</th>
                <th>fees</th>
                <th>city</th>
                <th>state</th>
                <th>action</th>
            </tr>
            <%
                CandidateController cc = new CandidateController();
                ArrayList<CandidateModel> candidates = cc.selectAll();
                System.out.println("data"+candidates.toString());
                for(CandidateModel candidate : candidates){
                
                
            %>
            <tr>
                <td><%= candidate.getName() %></td>
                <td><%= candidate.getPhone() %></td>
                <td><%= candidate.getEmail()%></td>
                <td><%= candidate.getCollege() %></td>
                <td><%= candidate.getAddress() %></td>
                <td><%= candidate.getDegree() %></td>
                <td><%= candidate.getSemester() %></td>
                <td><%= candidate.getFees() %></td>
                <td><%= candidate.getCity() %></td>
                <td><%= candidate.getState() %></td>
                
                <td>
                    <a class="btn btn-outline-warning" href="ViewCandidate.jsp?id=<%= candidate.getId()%>">View</a>
                    <a class="btn btn-outline-primary" href="UpdateCandidate.jsp?id=<%= candidate.getId()%>">Update </a>
                    <a onclick="return confirm('Are you sure?');" class="btn btn-outline-danger" href="CandidateController?action=delete&id=<%=candidate.getId()%>">   Delete </a>  
                </td>
            </tr>
            <% } %>
            <h2>${param.msg}</h2>
        </table>
        <a class="btn btn-outline-success" href="home.jsp">Back</a>
    </body>
</html>
