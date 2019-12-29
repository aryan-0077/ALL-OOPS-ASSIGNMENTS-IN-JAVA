import java.io.*; 
import java.util.*;
  
class Spiral{ 
   
 
    public static void main(String[] args) 
    { 
        int m ;
        int n ;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter m X n size :");
		m= sc.nextInt();
		n=sc.nextInt();
		
		int a[][]=new int [m][n];
		System.out.println("Enter the elements of m X n array :");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
        
        int i, k = 0, l = 0; 
    
  
        while (k < m && l < n) { 
            
            for (i = l; i < n; ++i) { 
                System.out.print(a[k][i] + " "); 
            } 
            k++; 
  
           
            for (i = k; i < m; ++i) { 
                System.out.print(a[i][n - 1] + " "); 
            } 
            n--; 
  
           
            if (k < m) { 
                for (i = n - 1; i >= l; --i) { 
                    System.out.print(a[m - 1][i] + " "); 
                } 
                m--; 
            } 
  
            // Print the first column from the remaining columns */ 
            if (l < n) { 
                for (i = m - 1; i >= k; --i) { 
                    System.out.print(a[i][l] + " "); 
                } 
                l++; 
            } 
        } 
    } 
}