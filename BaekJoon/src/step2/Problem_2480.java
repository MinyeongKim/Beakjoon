package step2;
import java.util.Scanner;

public class Problem_2480 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		in.close();
		
		if(a==b && b==c) {
			System.out.println(10000+a*1000);
		} else if(a==b) {
			System.out.println(1000+a*100);
		}else if(b==c) {
			System.out.println(1000+b*100);
		}else if(a==c) {
			System.out.println(1000+c*100);
		} else {
			if(a>b && a>c) {
				System.out.println(a*100);
			} else if(b>a && b>c) {
				System.out.println(b*100);
			} else {
				System.out.println(c*100);
			}
		}
	}
}
