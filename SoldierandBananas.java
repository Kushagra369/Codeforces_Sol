import java.util.*;

public class SoldierandBananas 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        int count=0;
        
        for(int i=0; i<w; i++)
        {
            count = count + (i+1)*k;
        }
        
        count = count-n;
        
        if(count<0)
        {
            count=0;
        }
        
        System.out.println(count);

    }
    
}
