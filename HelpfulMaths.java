import java.util.*;

public class HelpfulMaths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		List<Character> l = new ArrayList<>();
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)!='+')
			{
				l.add(s.charAt(i));
			}
		}
		
		Collections.sort(l);
		
		for(int i=0; i<l.size(); i++)
		{
			if(i<l.size()-1)
			{
				System.out.print(l.get(i)+"+");
			}
			else
			{
				System.out.print(l.get(i));
			}
		}
	}

}
