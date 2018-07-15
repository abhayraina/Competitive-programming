
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = 0;
		double distance = 0;
		
		double[] newcord = new double[1000];
		double[] oldcord = new double[1000];
		
		N = scan.nextInt();
		
		for (int i = 0; i < N; i++) {
			oldcord[i] = scan.nextDouble();
		}
		
		for (int j = 0; j < N; j++) {
			newcord[j] = scan.nextDouble();
		}
		
		scan.close();
		
		for (int k = 0; k < N; k++) {
			distance = distance + ((newcord[k] - oldcord[k])*(newcord[k] - oldcord[k]));
		}
		
		double result = Math.sqrt(distance);
		
		System.out.println(result);

	}

}
