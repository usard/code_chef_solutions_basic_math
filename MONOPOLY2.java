/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
     Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		    int large = 0;
		    int sum=0;
		    for(int i=0 ; i<4; i++) {
		        int temp= sc.nextInt();
		        if (temp > large) {
		            sum = sum+large;
		            large = temp;
		            
		        }
		        else {
		            sum= sum+temp;
		        }
		    }
		    if(large > sum) {
		        System.out.println("yes");
		    }
		    else {
		        System.out.println("no");
		    }
		}
	}
}
