import java.util.Scanner;

public class PrimeN 
{
    public static void main(String[] args) 
    {
        int num, a;
        
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        
        for(int i = 2; i < num; i++) 
        {
            a = 0;
            for (int j = 2; j < i; j++)
            {
                a = 0;
                if (i % j == 0)
                {
                    a = 1;
                }
            }
            if (a == 0)
            {
                 System.out.println("Prime no. are: " +i );                
            }            
        }   
    }
}
