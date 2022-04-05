package step2;
import java.util.Scanner;

public class Problem_2753 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int years = in.nextInt();
		in.close();
		
		if((years%4==0)&&((years%100!=0)||(years%400==0))) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}
