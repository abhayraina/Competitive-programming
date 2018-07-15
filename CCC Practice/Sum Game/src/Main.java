import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {

		int N, K = 0;
		int [] rSW = new int[100000];
		int [] rSem = new int[100000];
		int sW = 0, sEM = 0;
		
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
		N = Integer.parseInt(in.readLine());
		
		String [] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			rSW[i] = Integer.parseInt(tokens[i]);
		}

		String [] token2 = in.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			rSem[i] = Integer.parseInt(token2[i]);
		}
		in.close();
		
		for (int i = 0; i < N; i++) {
			sW = sW + rSW[i];
			sEM = sEM + rSem[i];
			
			if (sW == sEM) {
				K = i + 1;
			}
		}
		
		System.out.println(K);
		
		}catch (IOException e) {}
	}

}
