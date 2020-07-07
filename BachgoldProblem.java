import java.util.*;
public class BachgoldProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int x;
		if(n%2==0)
		{
			x = n/2;
		}
		else
		{
			x = n/2 -1;
		}
		
		System.out.println(n/2);
		
		for(int i=0; i<x; i++)
		{
			System.out.print("2 ");
		}
		
		if(n%2!=0)
		{
			System.out.print("3");
		}
	}

}
