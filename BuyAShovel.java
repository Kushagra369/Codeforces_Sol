import java.util.*;

public class BuyAShovel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int r = sc.nextInt();
		sc.close();
		int inc = k;
		int count = 1;
		
		while((k%10)!=r && (k%10)!=0)
		{
			k = k + inc;
			count++;
		}
		
		System.out.println(count);
	}

}
