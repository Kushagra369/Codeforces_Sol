import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class BadPrices {

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
	
	public static boolean checkless(int[] a, int i)
	{
		boolean ans = false;
		
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]>a[j])
			{
				ans = true;
				break;
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int t = sc.nextInt();
		
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			int count = 0;
			
			for(int i=0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			
			for(int i=0; i<n; i++)
			{
				if(checkless(a, i))
				{
					count++;
				}
			}
			
			System.out.println(count);			
		}
	}

}
