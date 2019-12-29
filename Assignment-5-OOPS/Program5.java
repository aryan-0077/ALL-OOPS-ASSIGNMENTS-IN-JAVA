import java.util.*;

class Program5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter string: ");
		s = sc.nextLine();
		System.out.print("Enter splitting character: ");
		String c = sc.nextLine().charAt(0) + "";
		String arr[] = s.split(c, 0);
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int k = i + 1;
			if ((i + 1) < arr.length) {
				while (arr[i].equals(arr[k])) {
					arr[k] = "0xa";
					if ((k + 1) == arr.length)
						break;
					else
						k++;
				}
			}
		}
		System.out.println("\nSorted tokens:\n");
		for (String a : arr) {
			if (a != "0xa")
				System.out.println(a);
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
