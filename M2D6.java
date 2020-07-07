import java.util.*;

public class M2D6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++)
		{
			int n = sc.nextInt();
			int ans = 0;
			int flag=0;
									
			while(flag==0 && n>1)
			{
				if(n%6!=0)
				{
					if(n%3!=0)
					{
						ans = -1;
						flag=1;
					}
					else
					{
						n = n*2;
						ans++;
						n = n/6;
						ans++;
					}
				}
				else
				{
					n = n/6;
					ans++;
				}
			}
			
			System.out.println(ans);
		}
		sc.close();

	}

}
