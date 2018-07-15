import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int numer = scan.nextInt();
		int denom = scan.nextInt();
		
		if (numer % denom == 0) {
			System.out.println(numer/denom);
		}
		else {
		
			int gcd = checkGCD(numer, denom);
			if (gcd == 1) {
				if (numer > denom) {
					int improp = numer/denom;
					int mix = numer % denom;
					
					System.out.println(improp + " " + mix+ "/" + denom);
				}
				else {
					System.out.println(numer+ "/" + denom);
				}
				
				
			}
			else {
			
			int reducednumer = numer/gcd;
			int reduceddenom = denom/gcd;
			
			if (reducednumer > reduceddenom) {
			int improper = reducednumer/reduceddenom;
			int mixed = reducednumer % reduceddenom;
			
			System.out.println(improper + " " +mixed+ "/" + reduceddenom);
			}
			else {
				System.out.println(reducednumer+ "/" + reduceddenom);
			}
			}
			
		}
scan.close();
	}
	
	public static int checkGCD (int numer, int denom) {
		int gcd = 0;
		
		for (int i = 1; i <= numer && i <= denom; i++) {
			if ((numer % i == 0) && (denom % i == 0)) {
				gcd = i;
			}
		}
		return gcd;
		
	}

}
