package Constructor;

class aa9
{
    int a,b,c;
    aa9()
    {
        a=10;
        b=15;
        System.out.println("Value of a: "+a);
        System.out.println("Value of b: "+b);
        c=a+b;
        System.out.println("Sum of two no : "+c);
    }
}
public class constructorBasic
{
    public static void main(String args[])
    {
        aa9 ob = new aa9();
    }
}
