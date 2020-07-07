import java.util.*;

public class GenerateLogin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String f = sc.next();
		String l = sc.next();
		sc.close();

		StringBuilder fn = new StringBuilder();
		StringBuilder ln = new StringBuilder();
		
		fn.append(f.charAt(0));
		ln.append(l.charAt(0));
		for(int i=1; i<f.length(); i++)
		{
			if(f.charAt(i)<l.charAt(0))
			{
				fn.append(f.charAt(i));
			}
			else
			{
				break;
			}
		}
		
		System.out.println(fn.toString()+ln.toString());
		
	}

}
