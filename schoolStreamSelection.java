package If_Else;
import java.util.*;
public class schoolStreamSelection
{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int marks;
        System.out.println("Enter marks:");
        marks= input.nextInt();
        if(marks>=65 && marks<=100)
        {
            if(marks>=85)
            {
                System.out.println("Eligible for Sc. , Comm. & arts");
            }
            else if(marks>=75)
            {
                System.out.println("Eligible for Comm. & arts");
            }
            else
            {
                System.out.println("Eligible for arts");
            }
        }
        else
        {
            if(marks>=55 && marks<65)
            {
                System.out.println("Wait for 2nd round.");
            }
            else
            {
                System.out.println("Not eligible");
            }
        }

    }
}
