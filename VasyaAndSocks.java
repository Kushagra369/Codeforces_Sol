import java.util.*;

public class VasyaAndSocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		int ans = n + (n-1)/(m-1);
				
		System.out.println(ans);
	}

}
