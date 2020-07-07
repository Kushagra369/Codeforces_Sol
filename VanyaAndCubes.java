import java.util.*;

public class VanyaAndCubes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int count = 0;
		int sum = 0;
		for(int i=1; i<=n; i++)
		{
			sum = sum + (i*(i+1))/2;
			if(sum>n)
			{
				break;
			}
			count++;
		}
		
		System.out.println(count);
	}

}
