import java.util.*;

public class URI_1143 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.printf("%d %d %d%n", i, i * i, i * i * i);
		}
		
		sc.close();
	}

}
