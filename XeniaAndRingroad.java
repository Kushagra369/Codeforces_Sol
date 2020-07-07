import java.util.*;
public class XeniaAndRingroad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long count = 0;
		long counter = 1;
		for(long i=0; i<m; i++)
		{
			long x = sc.nextInt();
			count = count + (x - counter + n)%n;
			counter = x;
		}
		sc.close();
		
		System.out.println(count);
	}

}
