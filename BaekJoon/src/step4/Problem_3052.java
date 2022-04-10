package step4;
import java.util.Scanner;

public class Problem_3052 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] A = new int[10];
		int[] rmd = new int[42];
		int temp;
		int cnt = 0;
		
		for(int i=0;i<10;i++) {
			A[i] = in.nextInt();
			temp = A[i] % 42;
			rmd[temp]++;
		}
		
		for(int j=0;j<42;j++) {
			if(rmd[j] != 0) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		in.close();
	}

}
