package step5;

public class Problem_4673 {
	int self_num(int a) {
		int sum = a;
		
		while(a != 0) {
			sum += a % 10;
			a /= 10;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int a = 1;
		boolean[] temp = new boolean[10001];
		Problem_4673 pro = new Problem_4673();
		
		while(true) {
			
			int s = pro.self_num(a);
			if(a>10001) {
				break;
			}
			if(s <=10000) {
				temp[s] = true;
			}
			
			a++;
		}
		
		for(int i=1; i<10001;i++) {
			if(!temp[i]) {
				System.out.println(i);
			}
		}
	}
}
