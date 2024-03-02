import java.util.Locale;
import java.util.Scanner;

public class URI_1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double hour, hour_work; 
		
		n = sc.nextInt();
		hour = sc.nextDouble();
		hour_work = sc.nextDouble();
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", n, hour * hour_work);
		
		sc.close();
	}

}
