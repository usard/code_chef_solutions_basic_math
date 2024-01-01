/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int objectWeight = sc.nextInt();
		    int targetWeight= objectWeight;
		    for(int i=0; i<3; i++) {
		        int a = sc.nextInt();
		        if (targetWeight >= a) {
		            targetWeight = targetWeight-a;
		        }
		   }
		   if(targetWeight == 0) {
		       System.out.println("YES");
		   }
		   else {
		       System.out.println("No");
		   }
		    
		}
	}
}
