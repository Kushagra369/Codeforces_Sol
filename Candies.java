import java.util.*;

public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int z=0; z<t; z++)
		{
			int n = sc.nextInt();
			double k = 2;
			double sum = 3;
			double ans = 0;
			
			while(true) 
			{
				if(n%sum==0)
				{
					ans = (n/sum);
					break;
				}
				else
				{
					sum = sum + Math.pow(2,  k);
					k++;
				}
			}
			
			System.out.println((int)ans);
		}
		sc.close();
	}

}
