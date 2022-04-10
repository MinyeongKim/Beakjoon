package step4;
import java.util.Scanner;

public class Problem_2562 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] A = new int[9];
		int max;
		int num_max;
		
		for(int i=0;i<9;i++) {
			A[i] = in.nextInt();
		}
		
		max = A[0];
		num_max = 1;
		
		for(int j=0;j<9;j++) {
			if(max<A[j]) {
				max = A[j];
				num_max = j+1;
			}
		}
		
		System.out.println(max);
		System.out.println(num_max);
		
		in.close();
	}
}
