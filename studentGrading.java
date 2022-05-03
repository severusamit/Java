package If_Else;
import java.util.*;
public class studentGrading
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter marks:");
        marks=input.nextInt();

        if(marks>=90)
        {
            System.out.println("Excellent.(E)");
        }
        else if(marks>=80)
        {
            System.out.println("Very Good");
        }
        else if (marks>=70)
        {
            System.out.println("Good");
        }
        else if(marks>=45)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Try Again");
        }
    }
}
