import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.Collections;
//import java.util.LinkedList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N;
		try {
			N = Integer.parseInt(in.readLine());
			
			Integer [] list = new Integer[N];
			for (int i = 0; i < N; i++) {
				list[i] = Integer.parseInt(in.readLine());
			}
			in.close();
			
			Arrays.sort(list);
			
			for (int i = 0; i < N; i++) {
				System.out.println(list[i]);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	
		
	
	
	}

}
