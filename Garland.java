import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;
import java.util.*;

public class Garland {

	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
	
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		String a = sc.next();
		String g = sc.next();
		List<Character> l = new ArrayList<>();
		List<Character> gar = new ArrayList<>();
		
		for(int i=0; i<a.length(); i++)
		{
			l.add(a.charAt(i));
		}
		
		for(int i=0; i<g.length(); i++)
		{
			gar.add(g.charAt(i));
		}
		
		int count = 0;
		int flag = 0;
		for(char x: gar)
		{
			if(!l.contains(x))
			{
				flag=1;
				break;
			}
		}
		
		for(char x: gar)
		{
			if(l.contains(x))
			{
				count++;
				int t = l.indexOf(x);
				l.remove(t);
			}
		}
		
		if(flag==1)
		{
			System.out.println("-1");
		}
		else
		{
			System.out.println(count);
		}
	}

}
