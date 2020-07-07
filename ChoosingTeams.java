import java.util.*;
public class ChoosingTeams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a= new int[n];
		int count=0;
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
			if(a[i]+k>5)
			{
				a[i] = -1;
			}
			else
			{
				count++;
			}
		}
		sc.close();
		
		System.out.println(count/3);
	}

}
