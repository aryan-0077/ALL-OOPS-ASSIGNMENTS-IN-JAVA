import java.util.*;
import java.math.*;
class Program10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows and columns of matrix: ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		int matrix[][] = new int[row][col];
		for(int i=0;i<row;i++) {
			System.out.print("Enter "+col+" values for "+i+"th row: ");
			for(int j=0;j<col;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		float correlation_matrix[][] = new float[row][row];
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				correlation_matrix[i][j] = getCorrelationFactor(matrix[i],matrix[j],col);
			}
		}
		System.out.println("correlation matrix is:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(correlation_matrix[i][j]+"\t\t");
			}
			System.out.println("\n");
		}
	}
	public static float getCorrelationFactor(int x[],int y[],int n) {
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
		return corr;
	}
}