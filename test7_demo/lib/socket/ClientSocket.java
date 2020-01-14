package test7_demo.lib.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientSocket {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.1.110",10086);
        ServerSocket ss =new ServerSocket(10086);
        OutputStream os = s.getOutputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(os));
        String s1=null;
        while((s1=br.readLine())!=null) {
            if("886".equals(s1)){break;}
            bw.write(s1);
            bw.newLine();
            bw.flush();



        }


        os.close();
        s.close();

    }
}
