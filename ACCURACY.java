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
		    int marks = sc.nextInt();
		    int questionsattempted = ( (marks%3) == 0 ? (marks/3) : (marks/3)+1 );
		    int incorrect = questionsattempted*3 - marks;
		    System.out.println(incorrect);
		}
	}
}
