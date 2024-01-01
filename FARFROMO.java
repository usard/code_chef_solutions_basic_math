import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		 while(T-->0) {
		     int x1 = sc.nextInt();
		     int y1 = sc.nextInt();
		     int x2 = sc.nextInt();
		     int y2 = sc.nextInt();
		     float a = (float)Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
		     float b = (float) Math.sqrt(Math.pow(x2,2)+ Math.pow(y2,2));
		     if(a>b) {
		         System.out.println("ALEX");
		     }
		     else if(a < b) {
		         System.out.println("BOB");
		     }
		     else {
		         System.out.println("EQUAL");
		     }
		 
		 }

	}
}
