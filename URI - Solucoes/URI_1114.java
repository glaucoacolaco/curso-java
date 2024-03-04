import java.util.*;

public class URI_1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		
		str = sc.next();
		while(!(str.equals("2002"))) {
			System.out.println("Senha Invalida");
			str = sc.next();
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
