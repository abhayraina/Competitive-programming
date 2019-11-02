import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data = br.readLine();
		String [] splitter = data.split(" ");
		int N = Integer.parseInt(splitter[0]);
		int M = Integer.parseInt(splitter[1]);
		
		
		String [][] maze = new String [M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; i < N; j++) {
				maze[i][j] = br.readLine();
			}
		}
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; i < N; j++) {
				System.out.println(2);
			}
		}
		
	}

}
