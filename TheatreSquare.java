import java.util.*;

public class TheatreSquare
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long a = sc.nextLong();

		long x = n/a;
		long y = m/a;

		if(n%a!=0)
		{
			x++;
		}
		if(m%a!=0)
		{
			y++;
		}

		long ans = x*y;
   
		System.out.println(ans);
	}
}