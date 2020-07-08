import java.util.*;

public class RaisingBacteria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int count = 0;
		
		while(n>0)
		{
			if(n%2==0)
			{
				n = n/2;
			}
			else
			{
				count++;
				n = (n-1)/2;
			}
		}
		
		System.out.println(count);
	}
}
