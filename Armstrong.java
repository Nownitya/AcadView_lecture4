
import java.util.Scanner;


public class Armstrong 
{
    public static void main(String[] args) 
    {
        int a, ans = 0, temp;
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();   
        
        temp = num;
        while (num > 0) 
        {
            a = num % 10;
            num = num / 10;
            ans = ans+(a * a * a);  
        }
        if (temp == ans) 
        {
            System.out.println("It is Armastrong number");
        }
        else
        {
            System.out.println("It is not a Armstrong Number");
        }
        
    }
    
}
