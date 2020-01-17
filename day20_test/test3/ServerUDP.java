package day20_test.test3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ServerUDP {

    public static void main(String[] args) {

        try {
            DatagramSocket ds=new DatagramSocket(10086);

            byte[] bys=new byte[1024];
            DatagramPacket datagramPacket=new DatagramPacket(bys,bys.length);
            ds.receive(datagramPacket);

            InetAddress ip = datagramPacket.getAddress();
            byte[] data = datagramPacket.getData();
            String str=new String(data);
            int port = datagramPacket.getPort();
            System.out.println(str+"-"+ip+"-"+port);

            ds.send(new DatagramPacket("我不好".getBytes(),"我不好".getBytes().length,ip,10000));

            ds.close();

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
