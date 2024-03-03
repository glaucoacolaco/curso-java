import java.util.*;

public class URI_1051 {

	@SuppressWarnings("nls")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double salary;
		
		salary = sc.nextDouble();
		if(salary <= 2000.00) {
			System.out.printf("Isento%n");
		} else if(salary >= 2000.01 && salary <= 3000.00) {
			System.out.printf("R$ %.2f%n", (salary - 2000.00) * 0.08);
		} else if(salary >= 3000.01 && salary <= 4500.00) {
			System.out.printf("R$ %.2f%n", (salary - 3000.00) * 0.18 + 1000.00 * 0.08);
		} else {
			System.out.printf("R$ %.2f%n", (salary - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08);
		}
		
		sc.close();
	}

}
