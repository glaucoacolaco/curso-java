import java.util.*;

public class URI_1153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n, fat = 1;
		
		n = sc.nextInt();
		for(int i = 1; i <= n; ++i) {
			fat *= i; 
		}
		System.out.println(fat);
		
		sc.close();
	}

}
