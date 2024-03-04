import java.util.*;

public class URI_1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
