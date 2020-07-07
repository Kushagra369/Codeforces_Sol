import java.util.*;

public class ChatRoom 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		String ans = "NO";
		int flag=0;
		char[] t = new char[] {'h','e','l','l','o'};
		
		
		if(s.length()<5)
		{
			ans = "NO";
		}
		else
		{
			char[] a = s.toCharArray();
			int c = 0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i]==t[c])
				{
					if(c==4)
					{
						flag=1;
						break;
					}
					else
					{
						c++;
					}
				}
			}
			
			if(flag==1)
			{
				ans = "YES";
			}
		}

		System.out.println(ans);
	}

}
