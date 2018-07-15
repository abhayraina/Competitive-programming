import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		
		for (int i = 0; i < N; i++) {
			
			String n = in.readLine();
			if (n.length() >2) {
				System.out.println(0);
				continue;
			}
			
			long x = Long.parseLong(n);
			
			if (x > 50) {
				System.out.println(0);
				continue;
			}
			System.out.println(factorial(x));
		}
		
		in.close();
	}
	
	   public static long factorial(long y) {
		
		   long z = 4294967296L;
		   long result = 1;
		   
		   for (long i = 1; i <=y; i++) {
			   result = (result * i) % z;
		   }
		    return result;
		   
	   }

}
