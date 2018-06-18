

import java.util.Scanner;

public class CheckNumArray
{

    
    private static Scanner sc;

	public static void main(String[] args)
    {
        int arr[]={1,4,6,7,8,9,10};
        int num1, num2;
        
        
        System.out.println("enter no.s");
        sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        int mid=(num1+num2)/2;
        
        
        boolean found=false;
        
       int num = 0;
       while(num1<=num2)
       {
           if(arr[mid]==num)
           {
               found=true;
               break;
            }
            else if(arr[mid]<num)
                num1=mid+1;
            else
                num2=mid-1;

            mid=(num1+num2)/2;

       }

       if(found==true)
           System.out.println("YES");
       else
            System.out.println("NO");

         }

    }