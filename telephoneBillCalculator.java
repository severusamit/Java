package If_Else;
/** 1 - 200   Free
 * 201 - 300  .50/c
 * 301-400    .75/c
 * 401-500    .1/c
 * >500      1.5/c
 * mr=100
 */

import java.util.*;
public class telephoneBillCalculator
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int nc,mr=100;
        double bill=0;
        System.out.println("Enter no of call");
        nc= input.nextInt();

        if(nc>=1 && nc<=200)
        {
            bill=mr;
        }
        else if(nc>=201 && nc<=300)
        {
            bill =(nc-200)*.50 +mr;
        }
        else if(nc>=301 && nc<=400)
        {
            bill =(nc=200-100)*.75 +50+mr;
        }
        else if(nc>=401 && nc<=500)
        {
            bill =(nc=200-100-100)*1+50+75+mr;
        }
        else if(nc>500)
        {
            bill=(nc-200-100-100-100)*1.5+50+75+100+mr;
        }
        System.out.println("Bill Amount : "+bill);
    }
}
