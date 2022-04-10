package step4;
import java.util.Scanner;

public class Problem_10818 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		int max;
		int min;
		
		for(int i=0;i<N;i++) {
			A[i] = in.nextInt();
		}
		
		max = A[0];
		min = A[0];
		
		for(int j=0;j<N;j++) {
			if(max<A[j]) {
				max = A[j];
			}
			
			if(min>A[j]) {
				min = A[j];
			}
		}
		
		System.out.println(min + " " + max);
		
		in.close();
	}
}
