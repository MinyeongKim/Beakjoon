package step4;
import java.util.Scanner;

public class Problem_8958 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		String str;
		char[] A;
		int cum = 0;
		int sc = 0;
		
		while(T>0) {
			str = in.next();
			str = str.toUpperCase();
			A = str.toCharArray();
			
			for(int i=0;i<A.length;i++) {
				if(A[i] == 'X') {
					cum = 0;
					continue;
				}
				
				if(A[i] =='O') {
					cum++;
					sc += cum;
				}
			}

			System.out.println(sc);
			
			cum = 0;
			sc = 0;
			T--;
		}
		
		
		in.close();
	}
}
