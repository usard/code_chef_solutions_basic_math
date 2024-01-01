// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;
import java.lang.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
             Scanner sc = new Scanner(System.in);
             int t = sc.nextInt();
            while(t --> 0)
            {
                int n = sc.nextInt();
                BigInteger fact = new BigInteger("n");
                if(n==0|| n==1) {
                   fact = BigInteger.valueOf("1");
                }
                else {
                    for(int i = n; i>0; i--)  {
                        fact = fact.multiply(BigInteger.valueOf(i-1));
                    }
                }
                System.out.println(fact);
            }
	    
	}
}





                // int n = sc.nextInt();
                // BigInteger fact = new BigInteger("1");
                // for(int i = 2; i <= n; i++)
                // fact = fact.multiply(BigInteger.valueOf(i));
                // System.out.println(fact);