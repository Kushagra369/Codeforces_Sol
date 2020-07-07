import java.util.*;

public class QueueAtTheSchool {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		String s = sc.next();
		sc.close();
		char[] a = s.toCharArray();
		
		for(int i=0; i<t; i++)
		{
			for(int j=0; j<n-1; j++)
			{
				if(a[j]=='B' && a[j+1]=='G')
				{
					a[j]='G';
					a[j+1]='B';
					j++;
				}
			}
		}
		
		for(char x:a)
		{
			System.out.print(x);
		}
	}

}
