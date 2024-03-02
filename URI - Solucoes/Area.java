import java.util.*;

public class Area {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = "Maria";
		int idade = 31;
		double n, salario = 4000.0;
		final double PI = 3.14159;
		
		n = sc.nextDouble();
		System.out.printf("A=%.4f%n", PI * n * n);
		System.out.printf("%s tem %d anos e ganha R$ %.2f", nome, idade, salario);
		
		sc.close();
	}
}
