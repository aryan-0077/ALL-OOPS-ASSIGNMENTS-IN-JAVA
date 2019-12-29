import java.io.*;
import java.net.*;

public class Socket_Server{
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();

            // Accept the sended data 
            DataInputStream dis = new DataInputStream(s.getInputStream());

            int i;
            FileOutputStream fout = new FileOutputStream("C:\\Users\\babbi\\Desktop\\Cheat_Codes\\Java\\file1.txt",false);

            // Reading the received data
            String str = (String)dis.readUTF();
            byte b[] = str.getBytes();
            fout.write(b);
            System.out.println("Message is : "+str);
            fout.close();
            ss.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}