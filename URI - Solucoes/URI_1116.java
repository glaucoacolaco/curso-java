import java.util.*;

public class URI_1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();
			if(b == 0) {
				System.out.printf("divisao impossivel%n");
			} else {
				System.out.printf("%.1f%n", (double)a/b);				
			}
		}
		
		sc.close();
	}

}
