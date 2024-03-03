import java.util.*;

public class URI_1038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, qtde;
		double price = 0.0;
		
		code = sc.nextInt();
		qtde = sc.nextInt();
		switch(code) {
			case 1:
				price = qtde * 4.00;
				break;
			case 2:
				price = qtde * 4.50;
				break;
			case 3:
				price = qtde * 5.00;
				break;
			case 4:
				price = qtde * 2.00;
				break;
			case 5:
				price = qtde * 1.50;
				break;
			default:
				System.out.println("Produto nao existe.");
		}
		
		System.out.printf("Total: R$ %.2f%n", price);
		
		
		sc.close();
	}

}
