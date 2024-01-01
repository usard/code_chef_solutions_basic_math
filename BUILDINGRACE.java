import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int T = sc.nextInt();
	  while(T-->0) {
	      int Afloornumber = sc.nextInt();
	      int Bfloornumber = sc.nextInt();
	      int Aspeed = sc.nextInt();
	      int Bspeed = sc.nextInt();
	      float chefTime = (float) Aspeed/Afloornumber;
	      float chefinaTime =(float) Bspeed/Bfloornumber;
	      if( chefTime > chefinaTime) {
	          System.out.println("chef");
	      }
	      else if(chefTime == chefinaTime) {
	          System.out.println("both");
	      }
	      else{
	          System.out.println("chefina");
	      }
	  }
	
	}
}
