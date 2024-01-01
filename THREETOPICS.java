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
     String [] arr = sc.nextLine().split(" ");
    //  System.out.println("s .."+s.length);
     String s = arr[arr.length-1];
     for(int i=0; i<arr.length-1; i++){
        //  System.out.println(arr[i]+ " "+s);
         if(arr[i].equals(s) ) {
             System.out.println("yes");
             return;
         }
     }
     System.out.println("no");
	}
}
