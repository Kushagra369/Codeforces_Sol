import java.util.*;

public class HitTheLottery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int count = 0;
		count = n/100;
		n = n%100;
		count = count+ n/20;
		n = n%20;
		count = count+ n/10;
		n = n%10;
		count = count + n/5;
		n = n%5;
		count = count + n;
		System.out.println(count);
	}

}
