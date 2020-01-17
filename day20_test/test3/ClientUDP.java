package day20_test.test3;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ClientUDP {
    /*  /*udp 用户数据报协议。是面向无连接的不安全的协议。适用于少量数据的传输。只把数据发送出去，
    不考虑对方时候接受和接受是否正确。在针对少量数据传输的时候，要比tcp快，而且实用*/

    public static void main(String[] args) {

        try {
            DatagramSocket ds=new DatagramSocket(10000);
            byte[] bys="udp,你好啊".getBytes();
            int length=bys.length;
            InetAddress ip = InetAddress.getLocalHost();
            int port=10086;
            DatagramPacket dp=new DatagramPacket(bys,length,ip,port);
            ds.send(dp);


            byte[] byss=new byte[1024];
            DatagramPacket d=new DatagramPacket(byss,byss.length);
            ds.receive(d);
            byte[] data = d.getData();
            String strs= new String(data);
            System.out.println(strs+"-"+d.getAddress());


            ds.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
