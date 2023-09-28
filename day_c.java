//day_c
package testing;

import java.net.*;
import java.util.*;
import java.io.*;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

public class day_c {
    public static void main(String[] args) throws Exception{
        Socket c = new Socket("localhost", 12345);
        InputStream is = c.getInputStream();
        byte data[] = new byte[50];
        is.read(data);
        String str = new String(data);
        System.out.println(str);
        c.close();
    }
    
}
