<%-- 
    Document   : UpdateCandidate
    Created on : Jun 20, 2023, 2:26:32 PM
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
        <title>Update</title>
    </head>
    <body>
        <h1 class="text-center text-primary" >Update Details</h1>
        <%
            int id = Integer.parseInt(request.getParameter("id"));
            CandidateController cc = new CandidateController();
            CandidateModel candidatee = cc.selectById(id);

        %>
        <form action="CandidateController">
            <input type="hidden" name="id" value="<%=id%>">
            <input type="hidden" name="action" value="update">
            <div class="mb-3">
                <label for="exampleFormControlInputl" class="form-label">Name</label>
                <input type="text" class="form-control" name="cname"placeholder="Enter Name"value="<%= candidatee.getName()%>">
            </div>

            <div class="mb-3">
                <label for="exampleFormControlInputl" class="form-label">Phone</label>
                <input type="number" class="form-control" name="phone"placeholder="Enter number"value="<%= candidatee.getPhone()%>">
            </div>

            <div class="mb-3">
                <label for="exampleFormControlInputl" class="form-label">Email</label>
                <input type="email" class="form-control" name="email"placeholder="Enter email"value="<%= candidatee.getEmail()%>">
            </div>
            
                <div class="mb-3">
                <label for="exampleFormControlInputl" class="form-label">College</label>
                <input type="text" class="form-control" name="college"placeholder="Enter college"value="<%= candidatee.getCollege()%>">
            </div>
            
                <div class="mb-3">
                <label for="exampleFormControlInputl" class="form-label">Address</label>
                <input id="exampleFormControlTextarea1" class="form-control" name="address" rows="2" value="<%= candidatee.getAddress()%>">
            </div>

                          <div class="mb-3">
                <label for="exampleFormControlInputl" class="form-label">Degree</label>
                <input type="text" class="form-control" name="degree"value="<%= candidatee.getDegree()%>">
            </div>
            
            <p>
                Semester :
                <select class="form-control"name="semester">
                    <option value="<%= candidatee.getSemester()%>"><%= candidatee.getSemester() %></option>
                    <option value="i">i</option>
                    <option value="ii">ii</option>
                    <option value="iii">iii</option>
                    <option value="iv">iv</option>
                    <option value="v">v</option>
             </select>
            </p>
            
            <div class="mb-3">           
  <label for="exampleFormControlInput1" class="form-label">Fees</label>
  <input type="number" class="form-control"name="fees" placeholder="enter fees" value="<%= candidatee.getFees() %>">
</div>
            <div class="mb-3">           
  <label for="exampleFormControlInput1" class="form-label">City</label>
  <input type="text" class="form-control"name="city" placeholder="enter city" value="<%= candidatee.getCity()%>">
</div>
            <div class="mb-3">           
  <label for="exampleFormControlInput1" class="form-label">State</label>
  <input type="text" class="form-control" name="state"  placeholder="Enter state"value="<%= candidatee.getState()%>">
</div>

<div>
    <button type="submit"class="btn btn-outline-success container">Save Changes</button><br><br>
    
    <button> <a href="showcandidate.jsp" class="btn btn-outline-success">back</a></button>
        
</div>
          
            
        </form>
<h1>${param.msg}</h1>
    </body>
</html>
