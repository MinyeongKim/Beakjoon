package step5;

public class Problem_15596 {
	
	long sum(int[] a) {
		int length = a.length;
		long s=0;
		for(int i=0;i<length;i++) {
			s += a[i];
		}
		
		return s;
	}
}

