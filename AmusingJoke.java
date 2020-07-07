import java.util.*;
public class AmusingJoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		String s = sc.next();
		sc.close();
		
		List<Character> l = new ArrayList<>();
		for(int i=0; i<s.length(); i++)
		{
			l.add(s.charAt(i));
		}
		int flag=0;
		
		char[] arr = new char[a.length()+b.length()];
		int j=0;
		int z=0;
		char x;
		for(int i=0; i<arr.length; i++)
		{
			if(i<a.length())
			{
				x = a.charAt(j);
				if(l.contains(x))
				{
					z = l.indexOf(x);
					l.remove(z);
				}
				else
				{
					flag=1;
					break;
				}
				j++;
			}
			else
			{
				x = b.charAt(j-a.length());
				if(l.contains(x))
				{
					z = l.indexOf(x);
					l.remove(z);
				}
				else
				{
					flag=1;
					break;
				}
				j++;
			}
		}
		
		if(flag==0 && l.size()==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}

}
