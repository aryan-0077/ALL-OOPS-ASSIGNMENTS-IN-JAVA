import java.util.*;
import java.io.*;

class FileExample1{
    public static void main(String[] args)throws IOException{
        int i;
        FileOutputStream fout = new FileOutputStream("C:\\Users\\babbi\\Desktop\\Cheat_Codes\\Java\\file1.txt",false);
        String s = "Aryan";

        byte b[] = s.getBytes();
        fout.write(b);
        // for(i=0;i<s.length();i++){
        //     fout.write(b[i]);
        // }

        fout.close();
    }
}