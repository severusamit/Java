package Array;
import java.util.*;
public class sortingArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int s,i,j,temp;
        System.out.println("Enter array size:");
        s= input.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter array elements:");

        for(i=0;i<s;i++)
        {
            arr[i]= input.nextInt();
        }
        System.out.println("Array Element");
        for(i=0;i<s;i++)
        {
            System.out.println(arr[i]);
        }

        for(i=0;i<s-1;i++)
        {
            for(j=i+1;j<s;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Data After Sorting");
        for(i=0;i<s;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
