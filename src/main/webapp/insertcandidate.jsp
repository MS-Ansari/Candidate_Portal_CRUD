<%-- 
    Document   : insertcandidate
    Created on : Jun 19, 2023, 12:18:00 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Candidate</title>

        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h2 class="text-primary text-center">Candidate Details</h2>

        <!--form-->
        <form action="CandidateController" class="container">
            <input type="hidden" name="action" value="insert">
            <div class="Container"> 
                <div class="mb-3">

                    <label for="exampleFormControlInputl" class="form-label">Name</label>
                    <input type="text" class="form-control"name="cname" placeholder="enter name">
                </div>
                <div class="mb-3">
                   <label for="exampleFormControlInputl" class="form-label">Phone</label>
                   <input type="number" class="form-control"name="phone" placeholder="Ind +91"> 
                </div>
                
                <div class="mb-3">
                    <label for="exampleFormControlInputl" class="form-label">Email</label>
                    <input type="email" class="form-control" placeholder="email" name="email">
                </div>
                <p>
                    Collage :
                    <select class="form-control" name="college">
                        <option>select</option>
                        <option>jit</option>
                        <option>nit</option>
                        <option>vnit</option>
                    </select>
                    
                </p>
                
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">Address</label>
                    <textarea class="form-control"id="exampleFormControlTextarea1"rows="3"name="address"> </textarea>
                    
                </div>
                
                   <p> Degree :
                    <select class="form-control " name="degree">
                        <option>Select</option>
                        <option value="BE"> BE</option>
                        <option value="BA">BA</option>
                        <option value="M.Tech">M.Tech</option>
                        <option value="B.Tech">B.Tech</option>
                    </select> 

                </p>
                  <p> Semester :
                    <select class="form-control " name="semester">
                        <option>Select</option>
                        <option value="i"> i</option>
                        <option value="ii">ii</option>
                        <option value="iii">iii</option>
                        <option value="iv">iv</option>
                        <option value="v">v</option>
                        <option value="vi">vi</option>
                        <option value="vii">vii</option>
                        <option value="viii">viii</option>
                    </select> 

                </p>
                <div class="mb-3">
                    <label for="exampleFormControlInputl" class="form-label">Fees</label>
                    <input type="number" class="form-control"placeholder="Enter fees" name="fees">
                    
                </div>
                <p>
                    City :
                    <select class="form-control"name="city">
                        <option>Select</option>
                        <option>Nagpur</option>
                        <option>Pune</option>
                        <option>Mumbai</option>
                        <option>Hydrabad</option>
                        <option>Noveda</option>
                        
                    </select>
                </p>
                
                       <p> State :
                    <select class="form-control " name="state">
                        <option>Select</option>
                        <option value="Maharashtra"> Maharashtra  </option>
                        <option value="Delhi">Delhi</option>
                        <option value="Goa">Goa</option>
                        <option value="Rajasthan">Rajasthan</option>
                    </select> 

                </p>
                <div class="text-center">
                    <button type="submit" class="btn btn-outline-danger">Submit</button>
                    
                </div>
            </div>

                
                    </form>
        <button>        <a href="home.jsp"class="btn btn-outline-success">Back</a></button>
        <h1>${param.msg}</h1>
                    </body>
                    </html>
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
