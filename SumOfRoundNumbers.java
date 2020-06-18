import java.util.*;

public class SumOfRoundNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t>0)
		{
			t--;

			int n = sc.nextInt();
			int count = 0;
			List<Integer> l = new ArrayList<>();

			if(n>=1000)
			{
				count++;
				l.add(n - n%1000);
				n = n%1000;
			}

			if(n>=100)
			{
				count++;
				l.add(n - n%100);
				n = n%100;
			}

			if(n>=10)
			{
				count++;
				l.add(n - n%10);
				n = n%10;
			}

			if(n<10 && n>0)
			{
				count++;
				l.add(n);
			}

			System.out.println(count);
			
			for(int a: l)
			{
				System.out.print(a+" ");
			}

			System.out.println();	
		}
	}
}