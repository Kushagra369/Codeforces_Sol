import java.util.*;

public class Dubstep 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String[] ans = s.split("WUB");
		for(int i=0; i<ans.length; i++)
		{
			if(!ans[i].isEmpty())
			{
				System.out.print(ans[i]+" ");
			}
		}
	}
}
