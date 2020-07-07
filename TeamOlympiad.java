import java.util.*;
public class TeamOlympiad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> one = new ArrayList<>();
		List<Integer> two = new ArrayList<>();
		List<Integer> three = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			if(x==1)
			{
				one.add(i+1);
			}
			else if(x==2)
			{
				two.add(i+1);
			}
			else
			{
				three.add(i+1);
			}
		}
		sc.close();
		
		int w = Math.min(one.size(), two.size());
		w = Math.min(w, three.size());
		System.out.println(w);
		
		for(int i=0; i<w; i++)
		{
			System.out.println(one.get(i)+" "+two.get(i)+" "+three.get(i));
		}
	}

}
