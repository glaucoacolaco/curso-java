import java.util.*;

public class Pago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, n1, n2;
		double price1, price2;
		
		code = sc.nextInt();
		n1 = sc.nextInt();
		price1 = sc.nextDouble();
		code = sc.nextInt();
		n2 = sc.nextInt();
		price2 = sc.nextDouble();
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", n1 * price1 + n2 * price2);
		
		sc.close();
	}

}
