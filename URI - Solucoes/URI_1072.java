import java.util.*;

public class URI_1072 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n, x, in = 0, out = 0;
		
		n = sc.nextInt();
		for(int i = 0; i < n; ++i) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				in+= 1;
			} else {
				out+= 1;
			}
		}
		System.out.printf("%d in%n%d out%n", in, out);
		
		sc.close();
	}

}
