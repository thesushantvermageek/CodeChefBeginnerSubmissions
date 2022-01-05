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
		
		int test = sc.nextInt();
		for(int t=0; t<test; t++) {
		    int n = sc.nextInt();
		    int sum = 0;
		    
		    sum += n%10;
		    while(n>=10) {
		        n = n/10;
		    }
		    
		    sum += n;
		    
		    System.out.println(sum);
		}
	}
}
