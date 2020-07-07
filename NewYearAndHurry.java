import java.util.*;

public class NewYearAndHurry {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
		k = 240-k;
		int time = 0;
		int p = 0;
				
		while(p<n)
		{
			if(time+(5*(p+1))<=k)
			{
				p++;
				time = time + 5*p;
			}
			else
			{
				break;
			}
		}
		
		System.out.println(p);
	}

}
