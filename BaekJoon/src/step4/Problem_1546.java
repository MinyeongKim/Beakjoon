package step4;
import java.util.Scanner;

public class Problem_1546 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double[] sc = new double[N];
		double M;
		double sum = 0;
		double avg;
		
		for(int i=0;i<N;i++) {
			sc[i] = in.nextInt();
		}
		
		M = sc[0];
		
		for(int j=0;j<N;j++) {
			if(M < sc[j]) {
				M = sc[j];
			}
		}
		
		for(int k=0;k<N;k++) {
			sc[k] = sc[k]/M*100;
			sum += sc[k];
		}
		
		avg = sum/N;

		System.out.println(avg);
		
		in.close();
	}
}
