package Array;
import java.util.*;
public class finfGivenNoArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int i,s,num,c=0;
        System.out.println("Enter array size");
        s= input.nextInt();
        int arr[] = new int[s];
        System.out.println("enter array element :");
        for(i=0;i<s;i++)
        {
            arr[i]= input.nextInt();
        }
        System.out.println("Array element");
        for(i=0;i<s;i++)
        {
            System.out.println(arr[i]);
        }
        num= input.nextInt();
        for(i=0;i<s;i++)
        {
            if(arr[i]==num)
            {
                c++;
            }
        }
        if(c>0)
        {
            System.out.println("Given no found");
        }
        else
        {
            System.out.println("Given no not found");
        }
    }
}
