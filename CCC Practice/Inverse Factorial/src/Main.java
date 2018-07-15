import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		long num;
		int fact = 1;
		int index;

		num = scan.nextLong();
		scan.close();

		for (int i = 1; i <= num; i++) {
			index = i;
			fact *= i;
			
			if (fact == num) {
				
				System.out.println(index);
				break;
			}
		}


		
	}

}
