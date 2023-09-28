//tcp1
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

public class tcp {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(12345);
        System.out.println("Server is ready!");
        Socket c = ss.accept();
        while (true){
            System.out.println("Clinet Port is:"+c.getPort());
            //reading data from client
            InputStream is = c.getInputStream();
            byte data[] = new byte[50];
            is.read(data);
            String mfc = new String(data);
            String mfs = "Hello " + mfc;
            OutputStream os = c.getOutputStream();
            os.write(mfs.getBytes());
        }
    }
}
