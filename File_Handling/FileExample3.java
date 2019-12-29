import java.io.*;

class FileExample3{
    public static void main(String[] args)throws IOException{
        BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\babbi\\Desktop\\Cheat_Codes\\Java\\file1.txt",true));
        bf.write("Aryan");
        bf.close();
    }
} 