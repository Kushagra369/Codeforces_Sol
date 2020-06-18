import java.io.*; 
import java.util.*; 
   
public class CountT 
{       
    static int numT(int a, int b, int c, int d)
    {
        int count = 0;
        
        for (int i=a; i<=b; i++) 
        { 
            for (int j=b; j<=c; j++) 
            {  
                for (int k=c; k<=d; k++) 
                {
                    if (i+j>k && j+k>i && i+k>j) 
                    {
			count++;
                    }
                }        
            } 
        }

	return count;
    }
    
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

	 
      
        System.out.println(numT(a, b, c, d)); 
    } 
} 