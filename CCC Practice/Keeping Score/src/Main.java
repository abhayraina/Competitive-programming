import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);

		int cost1 = scan.nextInt();
		int cost2 = scan.nextInt();
		int cost3 = scan.nextInt();
		int cost4 = scan.nextInt();
		int req = scan.nextInt();

		int minimumcheck = 10000000;
		int counter = 0;

		for (int x= 0; x <= req/cost1; x++) {
			for (int y= 0; y <= req/cost2; y++) {
				for (int z= 0; z <= req/cost3; z++) {
					for (int w= 0; w <= req/cost4; w++) {

						if (x*cost1+y*cost2+z*cost3+w*cost4 ==req) {
							 System.out.println("# of PINK is " + x + " # of GREEN is " + y + " # of RED is " + z + " # of ORANGE is " + w);
							counter++;
							
							if (x+y+z+w < minimumcheck) {
								minimumcheck = x+y+z+w;
							}
							
						}




					}	
				}
			}
		}
System.out.println("Total combinations is " + counter + ".");
System.out.println("Minimum number of tickets to print is " + minimumcheck + ".");









		scan.close();



	}

}
