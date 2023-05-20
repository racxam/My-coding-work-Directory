// package JDBC ;
// it is using only DMl - data manipluation language of the sql which is used to manipulate the data in the database
import java.sql.*;
public class dml {
   public static void main(String[] args) throws SQLException {
    int ids=10;
    String names="Dipu baby";
    String ages="420";
    String query="insert into emp (id,name,age) values(?,?,?)"; 
    // String query="insert into emp (id,name,age) values("+ids+",'"+names+"',"+ages+")"; 
    // this is very tough to implement 
    // for larger no of values in the databases 
    // instead we will better use prepared statment 
     // load the driver
     try{

         // Class.forName("com.mysql.jdbc.Driver");
     } catch(Exception e){
        System.out.println("Not found");
     }
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","rootroot");

    // Statement stmt=con.createStatement();
    // int count =stmt.executeUpdate(query); 
    PreparedStatement pst = con.prepareStatement(query);
    pst.setInt(1, ids);
    pst.setString(2, names);
    pst.setString(3, ages);
    int count = pst.executeUpdate();
    // count =stmt.executeUpdate("insert into emp (id,name,age) values(1,'mansi','43')" );

   System.out.println(count+" rows affected");
   con.close();

   } 
}
