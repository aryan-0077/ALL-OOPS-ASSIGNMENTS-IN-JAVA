import java.util.*;

class Program4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter string: ");
		s = sc.nextLine();
		System.out.print("Enter token size: ");
		int n = sc.nextInt();
		String arr[] = new String[s.length() / n];
		int j = 0;
		arr[0] = "";
		for (int i = 0; i < s.length(); i++) {
			int size = n;
			while (size > 0) {
				if (i < s.length())
					arr[j] += s.charAt(i);
				size--;
				i++;
			}
			if (size == 0) {
				if (j + 1 < (s.length() / n)) {
					j++;
					arr[j] = "";
					i--;
				}
			}
		}
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if ((i + 1) < arr.length) {
				int k = i + 1;
				while (arr[i].equals(arr[k])) {
					arr[k] = "DUpASHU436";
					k++;
					if (k >= arr.length)
						break;
				}
			}
		}
		System.out.println("\nSorted Tokens:\n");
		for (int k = 0; k <= j; k++) {
			if (arr[k] != "DUpASHU436")
				System.out.println(arr[k]);
		}
	}

	static void sort(String str[]) {
		int count = str.length;
		String temp;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (str[i].toLowerCase().compareTo(str[j].toLowerCase()) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
	}
}
