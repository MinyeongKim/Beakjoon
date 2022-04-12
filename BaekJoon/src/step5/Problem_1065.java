package step5;
import java.util.Scanner;

public class Problem_1065 {
	int ari_seq(int n) {
		int cnt = 0;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		
		for(int i=1;i<=n;i++) {
			if(i<100) {
				cnt += 1;
				continue;
			} else {
				n1 = i/100;
				n2 = (i-n1*100)/10;
				n3 = i%10;
				
				if(n2-n1 == n3-n2) {
					cnt++;
				}
			}
		}
				
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		Problem_1065 pro = new Problem_1065();
		int cnt = pro.ari_seq(N);
		
		System.out.println(cnt);
		
		in.close();
	}

}
