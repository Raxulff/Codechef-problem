/*
Link
https://www.codechef.com/START245D/problems/COOLCON
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    int t1 = sc.nextInt();
		    int t2 = sc.nextInt();
		    
		    int sec = 0;
		    while(t1 != t2 && t1 >= t2){
		        sec = sec + (int) Math.ceil((double) t1/10.0);
		        --t1
		        ;
		    }
		    System.out.println(sec);
		}
	}
}
