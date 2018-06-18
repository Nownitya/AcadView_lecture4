
import java.util.Scanner;


public class EvenN 
{
    public static void main(String[] args) 
    {
        int i;
        int num;
        
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        for(i = 2; i<num; i++) 
        {
            if (i%2==0)
            {
                 System.out.println("Prime no. are: " +i );                
            }            
        }
        
        
        
    }
    
}
