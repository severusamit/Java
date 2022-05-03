package If_Else;

/** And Operator
 */
import java.util.*;
public class maxAndMin
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.println("enter 3 different no:");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();

        if(a>b && a>c)
        {
            System.out.println("Max number : "+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("MAx no : "+b);
        }
        else
            System.out.println("Max no :"+c);
    }
}
