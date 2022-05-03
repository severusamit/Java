package Constructor;
class aa11
{
    int i;
    aa11(int n)
    {
        for(i=1;i<=10;i++)
        {
            System.out.println(n +" *"+ i +" = "+n*i);
        }
    }
}
public class multiplicationConstructor
{
    public static void main(String args[])
    {
        aa11 ob = new aa11(6);
    }
}
