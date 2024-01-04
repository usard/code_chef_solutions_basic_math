import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int R = sc.nextInt();
	  int O = sc.nextInt();
	  int C = sc.nextInt();
	   //System.out.println(C+(20-O)*36 +"  "+ R );
	   if(C+(20-O)*36 > R) {
	       System.out.println("YES");
	   }
	   else {
	       System.out.println("NO");
	   }
// 	  System.out.println(C+(20-O)*36 > R ? "YES":"NO");

	}
}
