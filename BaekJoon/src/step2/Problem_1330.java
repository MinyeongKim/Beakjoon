package step2;
import java.util.Scanner;

public class Problem_1330 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		
		if(a<b) {
			System.out.println("<");
		}else if(a>b) {
			System.out.println(">");
		}else {
			System.out.println("==");
		}
	}
}
