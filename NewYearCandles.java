import java.util.*;

public class NewYearCandles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int count = a;
		
		while(a>=b)
		{
			count = count + a/b;
			a = a/b + a%b;
		}
		
		System.out.println(count);
		
	}

}
