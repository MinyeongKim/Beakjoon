package step3;
import java.util.Scanner;

public class Problem_1110 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int N_temp = N;
		int cnt = 0;
		
		in.close();
		
		if(N<0 || N>99) {
			return;
		}
		
		while(true) {
				
			if(N<10) {
				N = (N%10)*10 + N;
			} else {
				int A = N/10;
				int B = N%10;
				int temp = A+B;
				
				N = (B*10) + (temp%10);
			}
			cnt++;
			
			if(N==N_temp) {
				System.out.println(cnt);
				break;
			}
			
		}
		
	}
}
