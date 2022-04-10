package step4;
import java.util.Scanner;

public class Problem_2577 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();
		
		int mul = A*B*C;
		int length = Integer.toString(mul).length();
		int[] num_cnt = new int[10];
		int[] temp = new int[length];

		
		for(int i=0;i<length;i++) {
			temp[i] = mul%10;
			mul = mul/10;
		}
		
		for(int j=0;j<length;j++) {
			num_cnt[temp[j]]++;
		}
		
		for(int k=0;k<10;k++) {
			System.out.println(num_cnt[k]);
		}
		
		in.close();
	}

}
