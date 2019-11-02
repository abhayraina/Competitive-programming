import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
	Scanner scan = new Scanner(System.in);
		
		int totTime = scan.nextInt();
		
		int totChores = scan.nextInt();
		
		int leftChores = totChores;
		
		
		int timeArr[] = new int[totChores];
		
		
		int count = 0;
		
		for(int i = 0; i < totChores; i++) {
			timeArr[i] = scan.nextInt();
		}
		
		scan.close();
		
		Arrays.sort(timeArr);	
		
		//Add logic
		
		for (int k = 0;  k < leftChores; k++) {
			if((totTime - timeArr[k]) >= 0) {
				totTime -= timeArr[k];
				count++;
			}
			else {
				break;
			}
		}
		
		System.out.println(count);
		
	
	}
}
