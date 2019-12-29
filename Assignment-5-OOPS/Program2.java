import java.util.*;
class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ar[] = new String[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter string: ");
			ar[i] = new String(sc.next());
		}
		for(int i=0;i<9;i++) {
			for(int j=i+1;j<10;j++)
			{
				if(compareStrings(ar[i],ar[j])) {
					String temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.print("Sorted strings are: ");
		for(int i=0;i<10;i++) {
			System.out.print(ar[i]+" ");
		}
	}
	public static boolean compareStrings(String str1,String str2) {
		int len1 = str1.length();
		int len2 = str2.length();
		int n = (len1<len2)?len1:len2;
		for(int i=0;i<n;i++) {
			if(str1.charAt(i) < str2.charAt(i))
				return false;
			else if(str1.charAt(i) > str2.charAt(i))
				return true;
		}
		if(len1<len2)
			return false;
		else
			return true;
	}
}