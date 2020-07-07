import java.util.*;
public class BrainsPhotos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[][] a = new String[n][m];
		
		int flag = 0;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				a[i][j] = sc.next();
				
				if(a[i][j].equals("C") || a[i][j].equals("M") || a[i][j].equals("Y"))
				{
					flag=1;
				}
			}
		}
		sc.close();
		
		if(flag==0)
		{
			System.out.println("#Black&White");
		}
		else
		{
			System.out.println("#Color");
		}
	}

}
