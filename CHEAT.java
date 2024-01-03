import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
           Scanner sc  = new Scanner(System.in);
           int T = sc.nextInt();
           while(T-->0) {
               int N = sc.nextInt();
               System.out.println((N-1)%7 ==0 ? (N-1)/7 : ((N-1)/7)+1);
           }
	}
}
