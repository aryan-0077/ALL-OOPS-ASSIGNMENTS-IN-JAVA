import java.util.*;
import java.io.*;
import java.net.*;

public class Socket_Client{
    public static void main(String[] args){
        try{
            Socket s = new Socket("localhost",6666);
            // Send the data to the client
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            int ch;
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\babbi\\Desktop\\Cheat_Codes\\Java\\read.txt"));
            
        // Read the data from the file and send it to server
            char[] str = new char[2000];
            bf.read(str,0,1500);
            String s3 = new String(str);
            dout.writeUTF(s3);

        dout.flush();
        dout.close();
        bf.close();
        s.close();
        }
        catch(Exception e){
            System.out.println("Exception is : "+e);
        }
    }
}