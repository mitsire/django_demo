//day_s
package testing;

import java.net.*;
import java.util.*;
import java.io.*;

public class day_s {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(12345);
        Socket cs = ss.accept();
        Date d = new Date();
        String msg = "Today's Date: "+ d;
        OutputStream os = cs.getOutputStream();
        os.write(msg.getBytes());
        ss.close();
    }
}
