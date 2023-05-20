// package JDBC ;
// it is using only DQL - data query language of the sql which is used to fetch the data from the database
import java.sql.*;
public class first {
   public static void main(String[] args) throws SQLException {
     // load the driver
     try{

         Class.forName("com.mysql.cj.jdbc.Driver");
     } catch(Exception e){
        System.out.println("Not found");
     }
    
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","rootroot");
    Statement stmt=con.createStatement();
    ResultSet rs=stmt.executeQuery("select* from emp");
    while(rs.next()){
      System.out.println(rs.getInt("id")+" "+rs.getString(2)+" "+rs.getInt("age"));
   }
   // rs.next(); // it is used to bring the pointer to the next line then it will print
   // System.out.println(rs.getString("name"));
   
   con.close();

   } 
}
