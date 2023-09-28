//udp_c
package testing;
import java.net.*;
import java.io.*;

public class udp_c {
    public static void main(String[] args) throws Exception{
        byte buff[] = new byte[1024];
        DatagramSocket ds = new DatagramSocket(1070);
        DatagramPacket p = new DatagramPacket(buff, buff.length);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("your name:");
        String msg = br.readLine();
        buff = msg.getBytes();
        ds.send(new DatagramPacket(buff, buff.length, InetAddress.getLocalHost(), 1069));
        ds.receive(p);
        String response = new String(p.getData());
        System.out.println("Message: " + response);
    }
    
}
