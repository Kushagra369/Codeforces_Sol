import java.util.*;

public class RestoringThreeNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int x = 0;
		int y = 0;

		if(a>b)
		{
			x = b;
			y = (a-b)/2;
		}
		else if(a<b)
		{
			x = a;
			y = (b-a)/2;
		}
		else 
		{
			x = a;
			y = 0;
		}

		System.out.println(x+" "+y);
	}
}