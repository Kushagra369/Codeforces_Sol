import java.util.*;

public class AntonAndPolyhedrons
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
                
        for(int i=0; i<n; i++)
        {
            String s = sc.next();
            
            if("Tetrahedron".equals(s))
            {
                count = count+4;
            }
            else if("Cube".equals(s))
            {
                count = count+6;
            }
            else if("Octahedron".equals(s))
            {
                count = count+8;
            }
            else if("Dodecahedron".equals(s))
            {
                count = count+12;
            }
            else if("Icosahedron".equals(s))
            {
                count = count+20;
            }
        }     
        
        System.out.println(count);
    }
}