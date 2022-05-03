package Array;

import java.util.*;
public class maxAndMinArray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int i,s,max,min;
        System.out.println("Enter array size");
        s=input.nextInt();
        int arr[]= new int[s];
        System.out.println("Enter array element");
        for(i=1;i<s;i++)
        {
            arr[i]=input.nextInt();
        }
        max=arr[0];
        min=arr[0];
        System.out.println("Array elements");
        for(i=0;i<5;i++)
        {
            System.out.println(arr[i]);
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println("Max number : " +max);
        System.out.println("Minumum number : "+min);
    }
}

