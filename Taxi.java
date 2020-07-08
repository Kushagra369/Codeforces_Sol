import java.util.*;

public class Taxi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[4];
		for(int i=0; i<n; i++)
		{
			a[sc.nextInt() -1]++;
		}
		sc.close();
		int t = 0;
		t = t + a[3];
		t = t + a[2];
		t = t + (Math.max(0,  a[0]-a[2]) + a[1]*2+3)/4;
		System.out.println(t);
	}

}
