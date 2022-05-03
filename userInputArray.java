package Array;
import java.util.*;
public class userInputArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int i,arr[]=new int[10];
        System.out.println("enter 10 array elements");
        for(i=0;i<10;i++)
        {
            System.out.print("arr["+i+"]=");
            arr[i]= input.nextInt();  // taking input from user
        }
        System.out.println("Array element");
        for(i=0;i<10;i++)
        {
            System.out.println(arr[i]);   //display
        }
    }
}
