import java.io.*;

class FileExample2{
    public static void main(String[] args)throws IOException{
        int i;
        FileInputStream fin = new FileInputStream("C:\\Users\\babbi\\Desktop\\Cheat_Codes\\Java\\file1.txt");

        do{
            i = fin.read();
            if(i!=-1){
                System.out.print((char)i);
            }
        }while(i!=-1);

        fin.close();
    }
}