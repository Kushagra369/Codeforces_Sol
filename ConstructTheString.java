import java.util.*;
public class ConstructTheString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			StringBuilder sb = new StringBuilder();
			char x = 'a';
			for(int i=0; i<b; i++)
			{
				sb.append(x);
				x++;
			}
			String ref = sb.toString();
			
			StringBuilder ss = new StringBuilder();
			
			for(int i=0; i<n; i++)
			{
				ss.append(ref.charAt(i%b));
			}
			
			String ans = ss.toString();
			System.out.println(ans);
		}
		sc.close();
	}

}
