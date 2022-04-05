package step2;
import java.util.Scanner;

public class Problem_9498 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int grade = in.nextInt();
		in.close();
		
		if(grade>=90 && grade<=100) {
			System.out.println("A");
		} else if(grade>=80 && grade<90) {
			System.out.println("B");
		} else if(grade>=70 && grade<80) {
			System.out.println("C");
		}else if(grade>=60 && grade<70) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
