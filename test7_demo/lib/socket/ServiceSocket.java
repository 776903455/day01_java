package test7_demo.lib.socket;




import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServiceSocket {

    public static void main(String[] args) throws IOException {
        ServerSocket ss =new ServerSocket(10086);
        Socket s = ss.accept();
        InputStream is = s.getInputStream();
        BufferedReader reader= new BufferedReader(new InputStreamReader(is));


         /*   byte[] bys=new byte[1024];*/
        String line=null;
        while ((line=reader.readLine())!=null) {
            System.out.println(line);
        }
        reader.close();
        s.close();

    }
}
