
public class SortArrayAsce 
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 1, 1, 1, 0, 0, 1, 0};
        int length = arr.length;
        int temp;
        int j=0;
        for (int i = 0; i < length; i++) 
        {
            if (arr[i]==0) 
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
				j++;
            }
        }
        System.out.print("Descending Order:");
        for (int i = 0; i < length; i++) 
        {
            System.out.print(arr[i] + ",");
        }
    }
}
