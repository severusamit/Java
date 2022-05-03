package Constructor;
import java.util.*;
class aa10
{
    int a,b,c;
    aa10()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of a and b :");
        a=input.nextInt();
        b= input.nextInt();
        disp();
    }
    void disp()
    {
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
        c=a+b;
        System.out.println("Sum of two no : "+c);
    }
}
public class userInputConstructor
{
    public static void main(String args[])
    {
        aa10 ob = new aa10();
    }
}
