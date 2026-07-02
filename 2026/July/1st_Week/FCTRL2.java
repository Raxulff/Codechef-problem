//https://www.codechef.com/problems/FCTRL2

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int fact = sc.nextInt();
		    BigInteger res = BigInteger.ONE;
		    for(int itr = 2;itr <= fact;itr++){
		        res = res.multiply(BigInteger.valueOf(itr));
		    }
		    		System.out.println(res);
		}

	}
}
