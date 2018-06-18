
import java.util.Scanner;


public class Reverse 
 {
    public static void main(String[] args) 
    {
        int num;
        int rev = 0;
        
        System.out.println("Enter no. to Reverse");
        
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
        
        while (num != 0) 
        {
            rev =rev *10;
            rev = rev + num%10;
            num = num/10;            
        }
        System.out.println("Reverse no. is: = " + rev);
    }
    
}