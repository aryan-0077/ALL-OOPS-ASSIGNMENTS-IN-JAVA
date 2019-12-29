
import java.util.*;
import java.io.*;

class Basic
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);

        int[] z = new int[10];
        int[] x = {2,3,4,5,6};

        int[][] m = new int[3][];
        m[0] = new int[5];
        m[1] = new int[4];
        m[2] = new int[3];

        int a[][]=new int [m][n];

        // STRINGS ...........>>>>>>>>>>
        char[] ch = {'A','B','C'};
        String s1 = new String(ch);

        char[] ch1 = s1.toCharArray();
        char ch2 = s1.charAt(0);
        String s2 = s1.toUpperCase();
        
        boolean b1 = s1.equals(s2);
        int cmp = s1.compareTo(s2);

        boolean b2 = s1.endsWith(s2);
              // What to replace -> to which thing to replace
        String s3 = s1.replace("ab", "cd");
        int index = s1.indexOf(str, fromIndex);
        int last_ind = s1.lastIndexOf(str, fromIndex);

        String sub = s1.substring(beginIndex, endIndex);
        String[] split = s1.split(String s);

        int a = Integer.parseInt(s,2);


        // SORT FUNCTION FOR ARRAYS
        Arrays.sort(str1); 

       System.out.println("Aryan Mittal");
   }
}