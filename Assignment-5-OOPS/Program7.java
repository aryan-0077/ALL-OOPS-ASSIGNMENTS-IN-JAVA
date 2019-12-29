import java.util.*;
class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int row = sc.nextInt();
		int[][] ar = new int[row][];
		int[] col = new int[row];
		for(int i=0;i<row;i++) {
			System.out.print("Enter number of column in row "+i +" : ");
			col[i] = sc.nextInt();
			ar[i] = new int[col[i]];
			for(int j=0;j<col[i];j++) {
				System.out.print("Enter value: ");
				ar[i][j] = sc.nextInt();
			}
		}
		System.out.println("Given array is:");
		for(int i=0;i<row;i++) {
			for(int j:ar[i]) {
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
		int colmax = -1;
		for(int i=0;i<row;i++) {
			if(colmax<col[i])
				colmax = col[i];
		}
		int[][] arr = new int[colmax][];
		int use[] = new int[colmax];
		for(int i=0;i<row;i++) {
			for(int j=0;j<ar[i].length;j++) {
				use[j]++;
			}
		}
		/*for(int i=0;i<colmax;i++) {
			System.out.println(use[i]);
		}*/
		for(int i=0;i<colmax;i++) {
			arr[i] = new int[use[i]];
			int k = 0;
			for(int j=0;j<row;j++) {
				if(ar[j].length>i) {
					arr[i][k] = ar[j][i];
					k++;
				}
			}
		}
		System.out.println("Transposed array is:");
		for(int i=0;i<colmax;i++) {
			for(int j:arr[i]) {
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
		int max_value = row>colmax?row:colmax;
		int sum[][] = new int[max_value][];
		for(int i=0;i<max_value;i++) {
			if(i<row && i<colmax) {
				sum[i] = new int[ar[i].length+arr[i].length];
				int k = 0;
				for(int j:ar[i]) {
					sum[i][k++] = j;
				}
				for(int j:arr[i]) {
					sum[i][k++] = j;
				}
			}
			else if(i<row) {
				sum[i] = new int[ar[i].length];
				int k = 0;
				for(int j:ar[i]) {
					sum[i][k++] = j;
				}
			}
			else {
				sum[i] = new int[arr[i].length];
				int k = 0;
				for(int j:arr[i]) {
					sum[i][k++] = j;
				}
			}
		}
		System.out.println("Sum array is:");
		for(int i=0;i<max_value;i++) {
			for(int j:sum[i]) {
				System.out.print(j+" ");
			}
			System.out.print("\n");
		}
	}
}