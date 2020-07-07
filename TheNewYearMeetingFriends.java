import java.util.*;

public class TheNewYearMeetingFriends 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for(int i=0; i<3; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		
		int ans = (a[2]-a[1]) + (a[1] - a[0]);
		
		System.out.println(ans);
	}

}
