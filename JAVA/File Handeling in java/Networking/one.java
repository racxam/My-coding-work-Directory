// Networking  uses java.net package and it uses 1. TCP and  2. UDP 
// 1. TCP -Transmission control protocol
// 2. UDP - User datagram protocol
import java.net.*;


public class one {
  public static void main(String[] args) throws Exception {
    URL obj= new URL("https://www.javatpoint.com/StringBuilder-class");
    System.out.println(obj.getProtocol());
    System.out.println(obj.getHost());
    System.out.println(obj.getPort());
    System.out.println(obj.getFile());

    InetAddress ip = InetAddress.getByName("www.unacedemy.com");
    System.out.println(ip.getHostName());
    System.out.println(ip.getHostAddress());
  }  
}
