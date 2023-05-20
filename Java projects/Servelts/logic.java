import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.*;
import java.sql.*;

public class logic extends HttpServlet {
    public void service(HttpServletRequest req,HttpServletResponse res) throws NullPointerException, IOException {
        // res.setContentType("text/html");
        String bidder_name = null;
        String pro_name = null;
        String bid_val = null;
        try {
            bidder_name = req.getParameter("name");
            pro_name = req.getParameter("products");
            bid_val = req.getParameter("bid_val");
        } catch (Exception e) {
            if (bidder_name == null) {
                bidder_name = "Nothin";
            }
            if (pro_name == null) {
                pro_name = "No product";
            }
            if (bid_val == null) {
                bid_val = "0";
            }
        }
        Connection con = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "rootroot");
            Statement stmt = con.createStatement();

            ps = con.prepareStatement("insert into Auction data values(?,?,?)");

            ps.setString(1, bidder_name);
            ps.setString(2, pro_name);
            ps.setString(3, bid_val);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
            System.exit(0);
        }
        try

        {
            PrintWriter out = res.getWriter();
            ResultSet rs = ps.executeQuery("select * from auction_data");
            while (rs.next()) {
                out.println("<br>Your data is : " + rs.getString(1) + " - " + rs.getString(2) + " - " + rs.getInt(3));
            }
            con.close();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

}
