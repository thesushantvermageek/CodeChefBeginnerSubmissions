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
		
		try{
			float amt = sc.nextFloat();
        	float bal = sc.nextFloat();
        	float temp;
    		
    		if(amt%5 == 0) {
    		    temp = bal;
        		bal -= (amt + 0.50);
        		if(bal<0)
            		System.out.println(temp);
            	else
            		System.out.println(bal);
    		}
    		else
        		System.out.println(bal);
		}catch(Exception e){
			return;
		}
	}
}
