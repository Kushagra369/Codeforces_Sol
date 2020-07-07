import java.util.*;

public class WarOfTheCorporations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String g = sc.next();
		String p = sc.next();
		sc.close();
		int count = 0;
		int i = 0;
		int x = 0;
		while(i<g.length() && x>=0)
		{
			x = g.indexOf(p, i);
			if(x>=0)
			{
				i = x+p.length();
				count++;
			}
		}
		
		System.out.println(count);
	}

}
