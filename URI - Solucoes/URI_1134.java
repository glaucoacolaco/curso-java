import java.util.*;

public class URI_1134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n, alc = 0, gas = 0, die = 0; 
		
		n = sc.nextInt();
		while(n != 4) {
			if(n == 1) {
				alc+= 1;
			} else if(n == 2) {
				gas+= 1;
			} else if(n == 3) {
				die+= 1;
			} 
			n = sc.nextInt();
		}
		System.out.printf("MUITO OBRIGADO%nAlcool: %d%nGasolina: %d%nDiesel: %d%n", alc, gas, die);
		
		sc.close();
	}

}
