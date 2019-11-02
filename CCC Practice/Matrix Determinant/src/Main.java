import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		long arr[][] = new long [N][N];
		
		for(int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = scan.nextLong();
			}
		}
		
		scan.close();
		
		System.out.println(determinant(arr) % 1000000007);
	}

	private static long determinant(long [][] arr) {
		// TODO Auto-generated method stub
		
		long determin = 0;
		
		long[][] temp;
		
		if (arr.length == 1) {
			determin = arr[0][0];
		}
		else if (arr.length == 2) {
			determin = (arr[0][0]*arr[1][1]) - (arr[1][0]*arr[0][1]); 
		}
		else {
			for (int i = 0; i < arr[0].length; i++) {
				temp = new long [arr.length-1][arr[0].length-1];
				
				for (int j = 1; j < arr.length; j++) {
					for (int k = 0; k < arr[0].length; k++) {
						if (k < i) {
							temp[j-1][k] = arr[j][k];
						}
						else if (k > i) {
							temp[j-1][k-1] = arr[j][k];
						}
					}
				}
				determin += arr[0][i] * Math.pow(-1, i) * determinant(temp);
			}
		}
	
	return determin;
	}
}
