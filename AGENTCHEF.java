import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T -->0) {
            int X = sc.nextInt();
            int numberOfInsurances = (100*100)%(20*X) == 0? (100*100)/(20*X): (100*100)/(20*X) + 1;
            System.out.println(numberOfInsurances);
        }

	}
}
