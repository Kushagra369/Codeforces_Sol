import java.util.*;

public class GennadyAndACardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ch = sc.next();
		List<String> l = new ArrayList<>();
		for(int i=0; i<5; i++)
		{
			String a = sc.next();
			l.add(a);
		}
		sc.close();
		String ans = "NO";
		
		for(String s:l)
		{
			if(ch.charAt(0)==s.charAt(0) || ch.charAt(1)==s.charAt(1))
			{
				ans = "YES";
			}
		}
		
		System.out.println(ans);
	}

}
