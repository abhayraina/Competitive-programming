
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int [] inputTides;
		int N;
		int count = 0;
		Integer [] loTides;
		int [] hiTides;

		N = scan.nextInt();


		inputTides = new int [N];
		loTides = new Integer [N / 2];
		hiTides = new int[N / 2];

		for (int i = 0; i < N; i++) {
			inputTides[i] = scan.nextInt();
		}

		Arrays.sort(inputTides);
		for (int i = 0; i < N / 2 ; i++) { 
			loTides[i] = inputTides[i];
		}

		Arrays.sort(loTides, Collections.reverseOrder());

		for (int i = N / 2; i < N; i++) {
			hiTides[count] = inputTides[i];
			count++;
		}

		for (int i = 0; i < N / 2; i++) {
			System.out.print(loTides[i] + " ");
			System.out.print(hiTides[i] + " ");
		}

		scan.close();
	}
}

