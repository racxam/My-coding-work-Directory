

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
<!--       <h1>Registration JSP Page</h1>-->
   <%
       String uname=request.getParameter("txtName");
       String pass1 = request.getParameter("txtPass1");
       String pass2 = request.getParameter("txtPass2");
       String email = request.getParameter("txtEmail");
       String ctry = request.getParameter("txtCon");
 if(pass1.equals(pass2)){
       try{
   Class.forName("com.mysql.cj.jdbc.Driver");
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb","root","rootroot");
   PreparedStatement stmt = con.prepareStatement("insert into user values (?,?,?,?)");
   stmt.setString(1, uname);   stmt.setString(2, pass1);
   stmt.setString(3, email);   stmt.setString(4, ctry);
   int row = stmt.executeUpdate();
   if(row==1) { out.println("<h1 class='pwd'>Registration Successful!</h1>"); }
   else {   
       out.println("<h1 class='pwd'>Registration Failed!</h1>");
       %>
           <jsp:include page="Register.html" ></jsp:include>
       <%
   
       }
   }catch(Exception e){out.println(e);}
 }
 else
 {
 out.println("<h1 class='pwd'>Password Mismatch</h1>");
 %>
 <jsp:include page="Register.html" ></jsp:include>
<% }
   %>
   </body>
</html>

