import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int numUnluck = input.nextInt();
		input.nextLine();
		
		int [] unluck = new int[numUnluck]; 
		String[] strInput = input.nextLine().split(" ");

		for (int i = 0; i < numUnluck; i++) {
			unluck[i] = Integer.parseInt(strInput[i]);
		}
		int numBuild = input.nextInt();

		int [] fl = new int[numBuild];

		for (int j = 0; j < numBuild; j++) {
			fl[j] = input.nextInt();
		}
		input.close();
		int [] fin = fl.clone();
		
		for (int i = 0; i < numBuild; i++) {
			for (int j = 0; j < numUnluck; j++) {
				if (unluck[j] < fl[i]) {
					fin[i]--;
					
				}
			}
		System.out.println(fin[i]);
		}
		
	}
}
