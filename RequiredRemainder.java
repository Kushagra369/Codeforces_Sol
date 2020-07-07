import java.util.*;

public class RequiredRemainder {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int j=0; j<t; j++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			int n = sc.nextInt();
			int ans=0;
			int temp2=0;
			
			int temp = n%x;
			if(temp==y)
			{
				ans = n;
			}
			else
			{
				temp = n/x;
				temp2 = temp*x;
				if((temp2+y)>n)
				{
					ans = x*(temp-1);
					ans = ans+y;
				}
				else
				{
					ans = temp2+y;
				}
				
			}
			
			System.out.println(ans);
			
		}
		sc.close();

	}

}
