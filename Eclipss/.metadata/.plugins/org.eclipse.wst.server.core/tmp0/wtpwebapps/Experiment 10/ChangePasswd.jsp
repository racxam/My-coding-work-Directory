<%-- 
    Document   : ForgotPassword
    Created on : 09-May-2023, 10:06:20 am
    Author     : adity
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page contentType="text/html" import="java.sql.*"%>
<html>
    <head>
        <style>
        body{
        font-family: 'Helvetica';
        text-align: center;
        background: teal;
        }
        .pwd{
            color: white;
            padding-top: 40px; 
            font-weight: 800;
        }
    </style>
    </head>
    <body>
       <!--<h1>Forgot Password JSP Page</h1>-->
   <%
       String uname=request.getParameter("txtName");
      
 
       try{
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root","rootroot");
   PreparedStatement stmt = con.prepareStatement("select txtEmail from user where txtName=?");
   stmt.setString(1, uname);
   ResultSet rs = stmt.executeQuery();
   if(rs.next()){
       if(rs.getString(1).length() > 0)
       {
           out.println("<h1 class='pwd'>SEND LINK TO CHANGE PASSWORD</h1>");
       }
       }
   else{
   out.println("<h1 class='pwd'>User Name not exist !!!!!</h1>");
   %>
   <jsp:include page="ChangePasswd.html" ></jsp:include>
       <%
   }
       }catch(Exception e){out.println(e);}
  %>
   </body>
</html>
