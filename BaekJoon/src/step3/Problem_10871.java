package step3;
import java.util.Scanner;

public class Problem_10871 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int X = in.nextInt();
		int A[] =	new int[N];
		
		for(int i=0;i<N;i++) {
			A[i] = in.nextInt();
		}
		in.close();
		
		for(int i=0;i<N;i++) {
			if(A[i]<X) {
				System.out.print(A[i] + " ");
			}
		}
		
	}
}
