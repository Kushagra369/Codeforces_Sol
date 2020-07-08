import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.StringTokenizer;

public class A_And_B_AndCompilationErrors {

	static class FastReader 
	{ 
	    BufferedReader br; 
	    StringTokenizer st; 
	  
	    public FastReader() 
	    { 
	        br = new BufferedReader(new InputStreamReader(System.in)); 
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
		FastReader sc =  new FastReader();
		int n = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for(int i=0; i<n; i++)
		{
			sum1 = sum1 + sc.nextInt();
		}
		for(int i=0; i<n-1; i++)
		{
			sum2 = sum2 + sc.nextInt();
		}
		for(int i=0; i<n-2; i++)
		{
			sum3 = sum3 + sc.nextInt();
		}
		
		System.out.println(sum1 - sum2);
		System.out.println(sum2 - sum3);
	}

}
