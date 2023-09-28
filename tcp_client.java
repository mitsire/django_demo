//tcp1c
package testing;
import java.io.*;
import java.net.*;

public class tcp_client {
    public static void main(String[] args) throws Exception{
        System.out.println("Connecting to server");
        Socket cs = new Socket("localhost",12345);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("The local port"+cs.getLocalPort()+"\n The remote port"+cs.getPort());
        System.out.println("The Local socket is"+cs);
        System.out.println("Enter Your Name");
        String str = br.readLine();
        OutputStream os = cs.getOutputStream();
        os.write(str.getBytes());
        InputStream is = cs.getInputStream();
        byte data[] = new byte[50];
        is.read(data);
        String mfs = new String(data);
        mfs=mfs.trim();
        System.out.println(mfs);
    }
    
}
