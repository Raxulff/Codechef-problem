/*
https://www.codechef.com/START245D/problems/FAVWD
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char ch1 = input.charAt(0);
		int n = input.length();
		char ch2 = input.charAt(n-1);
		if(ch1 == 'c' || ch2 == 'f'){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
	}
}
