import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int N = sc.nextInt();
		    System.out.println(N%5 == 0? (N/5)*4: ((N/5)*4)+(N%5));
		}

	}
}
