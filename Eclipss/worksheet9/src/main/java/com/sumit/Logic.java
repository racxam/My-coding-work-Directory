package com.sumit;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Logic extends HttpServlet {
    private static final long serialVersionUID = 1L;


        public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
            res.setContentType("html");
            PrintWriter pw=res.getWriter();
            String n=req.getParameter("name");
            String p=req.getParameter("products");
            int e=Integer.parseInt(req.getParameter("bid_val"));
    
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con= DriverManager. getConnection("jdbc:mysql://localhost:3306/CU", "root", "rootroot");
                Statement stmt = con.createStatement();
    
                PreparedStatement ps = con.prepareStatement("insert into auc values(?,?,?)");
    
                ps.setString(1,n );
                ps.setString(2, p);
                ps.setInt(3, e);
                int i=ps.executeUpdate();
                
                if(i>0){
                    pw.print("You are successfully registered...");
                }
                ResultSet rs=stmt.executeQuery("select * from auc where bidder_name='"+n+"'");
                 while(rs.next()){
                        pw.println("Your data is: "+rs.getString(1)+"     "+rs.getString(2)+"      "+rs.getInt(3));
                    }
                con.close(); }
        catch(Exception e2){
        	System.out.println("Something in wrong");
            System.out.println(e2);
            
        }
        pw.close();
        
    }

}