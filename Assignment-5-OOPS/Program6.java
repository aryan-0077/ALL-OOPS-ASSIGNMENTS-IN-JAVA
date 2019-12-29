import java.util.*;
class Substance {
	String[][] ar = new String[5][3];
	Substance() {
		ar[0][0] = new String("Water");
		ar[0][1] = "0";
		ar[0][2] = "100";
		ar[1][0] = new String("Acetic acid");
		ar[1][1] = "17";
		ar[1][2] = "118";
		ar[2][0] = new String("Benzene");
		ar[2][1] = "5";
		ar[2][2] = "80";
		ar[3][0] = new String("Phenol");
		ar[3][1] = "43";
		ar[3][2] = "181";
		ar[4][0] = new String("Cyclohexane");
		ar[4][1] = "6";
		ar[4][2] = "81";
	}
	public String getName(String temp) {
		for(int i=0;i<5;i++) {
			if(temp.equals(ar[i][1])) {
				return "Freezing point of " + ar[i][0];
			}
			if(temp.equals(ar[i][2])) {
				return "Boiling point of " + ar[i][0];
			}
		}
		return "Matches with nothing";
	}
}
class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Substance sub = new Substance();
		System.out.print("Enter temperature: ");
		String temp = sc.next();
		System.out.println(sub.getName(temp));
	}
}