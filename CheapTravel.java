import java.util.*;
public class CheapTravel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		double ans = 0;
		
		if((b/m)>a)
		{
			ans = n*a;
		}
		else
		{
			int x = (int)n/(int)m;
			ans =  x*b;
			int y = (int)n%(int)m;
			
			if(y*a>b)
			{
				ans= ans + b;
			}
			else
			{
				ans = ans + y*a;
			}
		}
		
		System.out.println((int)ans);
	}

}
