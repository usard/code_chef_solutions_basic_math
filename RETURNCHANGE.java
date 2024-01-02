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
		    int X = sc.nextInt();
		    int amountBack  = X%10 == 0 ? 100-(X) : (X%10 <5 ? 100-((X/10)*10)  : (100-(((X/10)+1)*10)));
		    System.out.println(amountBack);
		}

	}
}
