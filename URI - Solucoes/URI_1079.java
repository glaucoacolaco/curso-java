import java.util.Scanner;

public class URI_1079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		for(int i = 0; i < n; ++i) {
			double a, b, c;
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			System.out.printf("%.1f%n", (a * 2 + b * 3 + c * 5)/10);
		}
		
		sc.close();
	}

}
