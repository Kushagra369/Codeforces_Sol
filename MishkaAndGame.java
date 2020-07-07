import java.util.*;

public class MishkaAndGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 0;
		int c = 0;
		
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(x>y)
			{
				m++;
			}
			else if(y>x)
			{
				c++;
			}
		}
		
		sc.close();
		
		if(m>c)
		{
			System.out.println("Mishka");
		}
		else if(c>m)
		{
			System.out.println("Chris");
		}
		else
		{
			System.out.println("Friendship is magic!^^");
		}
	}

}
