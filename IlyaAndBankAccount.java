import java.util.*;

public class IlyaAndBankAccount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.close();
		if(t<0)
		{
			String s = Integer.toString(t);
			List<Character> l = new ArrayList<>();
			for(int i=0; i<s.length(); i++)
			{
				l.add(s.charAt(i));
			}
			int n = s.length();
			int x = (int)s.charAt(n-1);
			int y = (int)s.charAt(n-2);
			if(x>y)
			{
				l.remove(n-1);
			}
			else
			{
				l.remove(n-2);
			}
			
			for(int i=0; i<n-1; i++)
			{
				if(i==0)
				{
					if(l.get(i+1)!='0')
					{
						System.out.print(l.get(i));
					}
				}
				else
				{
					System.out.print(l.get(i));
				}
			}
		}
		else
		{
			System.out.println(t);
		}
		
	}

}
