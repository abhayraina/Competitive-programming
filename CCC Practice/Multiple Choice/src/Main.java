import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		String [] stuans = new String[N];
		
		int cor =0;
		
		for(int i = 0; i < stuans.length; i++) {
			stuans[i] = scan.next();		
			}
		
		
		String [] rtans = new String [N];
		for(int i = 0; i < rtans.length; i++) {
			rtans[i] = scan.next();		
			}
		
		for (int k = 0; k < rtans.length; k++) {
			if (stuans[k].equals(rtans[k])) {
				cor++;
			}
		}
		
		System.out.println(cor);
		
		
		
		
		scan.close();
	}

}
