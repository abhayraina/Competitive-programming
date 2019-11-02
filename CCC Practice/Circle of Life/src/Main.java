import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] stateCell;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int totCells = Integer.parseInt(st.nextToken());
		long checks = Integer.parseInt(st.nextToken());
		stateCell = new int[totCells];
		
		String [] line = in.readLine().split("");
		
		for(int i = 0; i < totCells; i++) {
			stateCell[i] = Integer.parseInt(line[i]);
		}
		
		stateCell = sim(checks);
		
		for (int k = 0; k < stateCell.length; k++) {
			System.out.print(stateCell[k]);
		}
		
	}
	private static int[] sim(long checks) {
		// TODO Auto-generated method stub
		for(int i = 0; i < checks; i++) {
			int[] checkArr = stateCell.clone();
			for(int j = 0; j < stateCell.length; j++) {
				int left = 0, right = 0;
				
				if(j == 0) {
					left = stateCell.length-1;
					right = j+1;
				}
				else if(j == stateCell.length-1) {
					left = j-1;
					right = 0;
				}
				else {
					left = j-1;
					right = j+1;
				}
				
				if(checkArr[left] == 0 && checkArr[right] == 0) {
					stateCell[j] = 0;
				}
				else if((checkArr[left] == 0 && checkArr[right] == 1) || (checkArr[left] == 1 && checkArr[right] == 0)) {
					stateCell[j] =1;
				}
				else if (checkArr[left] == 1 && checkArr[right] == 1) {
					stateCell[j] = 0;
				}
				
			}
		}
		
		return stateCell;
	}

}
