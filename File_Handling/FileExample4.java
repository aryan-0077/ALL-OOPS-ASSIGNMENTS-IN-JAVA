import java.io.*;

class FileExample4{
    public static void main(String[] args)throws IOException{
        int ch;
        
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\babbi\\Desktop\\Cheat_Codes\\Java\\file1.txt"));

        
        // while((ch=bf.read()) != -1){
        //     System.out.print((char)ch);
        // }

        String s1;
        int i=1;
        while((s1 = bf.readLine()) != null)
        {
            System.out.println(i+":"+s1);
            i++;
        }

        // char[] s = new char[20];
        // bf.read(s,2,15);
        // System.out.println(s);

        bf.close();
    }
}