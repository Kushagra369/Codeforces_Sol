import java.util.*;

public class StartUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		sc.close();
		List<Character> check = new ArrayList<>(Arrays.asList('B', 'C', 'D', 'E', 'F', 'G', 'J', 'K', 'L', 'N', 'P', 'Q', 'R', 'S', 'Z'));
		List<Character> l = new ArrayList<>();
		int flag=0;
		for(int i=0; i<a.length(); i++)
		{
			l.add(a.charAt(i));
			
			if(check.contains(a.charAt(i)))
			{
				flag = 1;
				break;
			}
		}
		
		if(flag==1)
		{
			System.out.println("NO");
		}
		else
		{
			for(int i=0,j=l.size()-1; i<j; i++,j--)
			{
				if(l.get(i)!=l.get(j))
				{
					flag=1;
				}
			}
			
			if(flag==1)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}
		}
	}

}
