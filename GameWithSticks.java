import java.util.*;

public class GameWithSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int count=0;
		String s = " ";
		
		for(int i=0, j=0; i<n && j<m; i++,j++)
		{
			if (count==0)
			{
				count=1;
			}
			else if(count==1)
			{
				count=0;
			}
		}
		
		if(count==0)
		{
			s = "Malvika";
		}
		else
		{
			s = "Akshat";
		}
		
		System.out.println(s);
	}

}
