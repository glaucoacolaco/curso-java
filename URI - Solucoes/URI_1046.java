import java.util.*;

public class URI_1046 {

	@SuppressWarnings("nls")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int ini, fim;
		
		ini = sc.nextInt();
		fim = sc.nextInt();
		
		if(ini == fim) {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		} else if(ini < fim) {
			System.out.println("O JOGO DUROU "+ (fim - ini) +" HORA(S)");
		} else {
			System.out.println("O JOGO DUROU "+ (24 - ini + fim) +" HORA(S)"); 
		}
		
		sc.close();
	}

}
