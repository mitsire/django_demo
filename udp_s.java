//udp_s
package testing;
import java.net.*;
import java.io.*;

public class udp_s {
    public static void main(String[] args) throws Exception{
        byte buff[] = new byte[1024];
        DatagramSocket ds = new DatagramSocket(1069);
        DatagramPacket p = new DatagramPacket(buff, buff.length);
        System.out.println("Server Ready");
        ds.receive(p);
        String msg = new String(p.getData());
        String response = "Hello " + new String(buff);
        buff = response.getBytes();
        ds.send(new DatagramPacket(buff, buff.length, InetAddress.getLocalHost(), 1070));
        System.out.println("Message Received:"+msg);

    }
    
}
