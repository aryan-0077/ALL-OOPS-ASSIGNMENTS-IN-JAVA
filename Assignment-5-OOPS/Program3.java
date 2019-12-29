import java.util.*;
class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter paragraph: ");
		String paragraph = sc.nextLine();
		//System.out.println(paragraph);
		int len = paragraph.length();
		int count = 1;
		for(int i=0;i<len;i++) {
			if(paragraph.charAt(i)==' ')
				count++;
		}
		String ar[] = new String[count];
		int k = 0;
		for(int i=0;i<len;i++) {
			int j = i+1;
			while(j!=len && paragraph.charAt(j)!=' ')
			{
				j++;
			}
			ar[k] = new String(paragraph.substring(i,j));
			k++;
			i=j-1;
		}
		for(int i=0;i<count-1;i++) {
			for(int j=i+1;j<count;j++)
			{
				if(compareStrings(ar[i],ar[j])) {
					String temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.print("Sorted strings are: ");
		for(int i=0;i<count;i++) {
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