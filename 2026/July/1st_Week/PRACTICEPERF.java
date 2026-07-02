/*
https://www.codechef.com/problems/PRACTICEPERF
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for(int itr = 1;itr <= 4;itr++){
		    int num = sc.nextInt();
		    if(num >= 10) count++;
		}
		System.out.println(count);
	}
}
