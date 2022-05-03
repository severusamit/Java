package Constructor;
class aa12
{
    int a,b,c;
    aa12(int x,int y)
    {
        a=x;
        b=y;
        disp();
    }
    void disp()
    {
        System.out.println("VAlue of a : "+a);
        System.out.println("Value of b : "+b);
        c=a*b;
        System.out.println("Product of two no : "+c);
    }
}
public class parameterizedConstructor
{
    public static void main(String args[])
    {
        aa12 ob = new aa12(10 ,20);
    }
}
