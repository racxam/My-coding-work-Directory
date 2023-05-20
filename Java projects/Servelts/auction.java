import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class auction extends HttpServlet {
    private static final long serialVersionUID = 1L;


        protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
            res.setContentType("index/html");
            PrintWriter pw=res.getWriter();
            String n=req.getParameter("userName");
            String p=req.getParameter("productName");
            int e=Integer.parseInt(req.getParameter("bidValue"));
    
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "rootroot");
                Statement stmt = con.createStatement();
    
                PreparedStatement ps = con.prepareStatement("insert into inventory values(?,?,?)");
    
                ps.setString(1,n );
                ps.setString(2, p);
                ps.setInt(3, e);
                int i=ps.executeUpdate();
                
                if(i>0){
                    pw.print("You are successfully registered...");
                }
                ResultSet rs=stmt.executeQuery("select * from user where UName='"+n+"'");
                 while(rs.next()){
                        pw.println("<br>Your data is:"+rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3));
                    }
                con.close(); }
        catch(Exception e2){
            System.out.println(e2);
        }
        pw.close();
        
    }

}