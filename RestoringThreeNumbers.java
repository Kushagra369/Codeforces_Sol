import java.util.*;

public class RestoringThreeNumbers
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long[] ar = new long[4];

		for(int i=0; i<4; i++)
		{
			ar[i] = sc.nextLong();
		}

		Arrays.sort(ar);

		long a, b, c;

		a = ar[3] - ar[0];
		b = ar[3] - ar[1];
		c = ar[3] - ar[2];

		System.out.println(a+" "+b+" "+c);
	}
}