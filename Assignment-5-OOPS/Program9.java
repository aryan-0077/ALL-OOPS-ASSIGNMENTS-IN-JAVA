import java.util.*;
import java.math.*;
class Program9{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of arrays: ");
		int n = sc.nextInt();
		int x[] = new int[n];
		System.out.print("Enter "+n+" elements for first array: ");
		for(int i=0;i<n;i++) {
			x[i] = sc.nextInt();
		}
		int y[] = new int[n];
		System.out.print("Enter "+n+" elements for second array: ");
		for(int i=0;i<n;i++) {
			y[i] = sc.nextInt();
		}
		int sum_x = 0;
		int sum_y = 0;
		int sum_xy = 0;
		int sum_xx = 0;
		int sum_yy = 0;
		for(int i=0;i<n;i++) {
			sum_x += x[i];
			sum_y += y[i];
			sum_xy += x[i]*y[i];
			sum_xx += x[i]*x[i];
			sum_yy += y[i]*y[i];
		}
		float corr = (float)(n*sum_xy - sum_x*sum_y)/(float)(Math.sqrt((n*sum_xx-sum_x*sum_x)*(n*
			sum_yy-sum_y*sum_y)));
		System.out.println("Correlation factor of given arrays: "+corr);
	}
}