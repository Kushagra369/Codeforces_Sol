import java.util.*;

public class PoliceRecruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rec = 0;
		int unt = 0;
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			if(x>0)
			{
				rec = rec + x;
			}
			else
			{
				if(rec>0)
				{
					rec--;
				}
				else
				{
					unt++;
				}
			}
		}
		
		sc.close();
		System.out.println(unt);
	}

}
