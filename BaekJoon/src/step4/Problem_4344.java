package step4;
import java.util.Scanner;

public class Problem_4344 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int[] A;
		
		while(T>0) {
			int sum=0;
			int N=0;
			double avg=0;
			double rate=0;
			double num=0;
			
			N = in.nextInt();
			A = new int[N];
			for(int i=0;i<N;i++) {
				A[i] = in.nextInt();
			}
			
			for(int j=0;j<N;j++) {
				sum += A[j];
			}
			
			avg = sum/N;
			
			for(int k=0;k<N;k++) {
				if(A[k] > avg) {
					num++;
				}
			}

			rate = num/N*100;
			
			System.out.println(String.format("%.3f", rate)+"%");
			T--;
		}
		
		in.close();
	}

}
