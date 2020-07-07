import java.util.*;
public class MoveBrackets 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++)
		{
			int n = sc.nextInt();
			String s = sc.next();
			int count = 0;
			int min = 0;
			
			for(int j=0; j<n; j++)
			{
				if(s.charAt(j)=='(')
				{
					count++;
				}
				else
				{
					count--;
				}
				
				if(count<min)
				{
					min = count;
				}
			}
			
			System.out.println(Math.abs(min));
		}
		
		sc.close();

	}

}
