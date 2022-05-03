package Array;
import java.util.*;
public class userInputMatrix
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int i,j;
        System.out.println("Enter matrix element");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("arr["+i+"]["+j+"]= ");
                arr[i][j]= input.nextInt();  //taking input from user

            }
        }
        System.out.println("-------------------------------------------");
        System.out.println("Matrix element are");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);  // display
            }
            System.out.println();
        }
    }
}
