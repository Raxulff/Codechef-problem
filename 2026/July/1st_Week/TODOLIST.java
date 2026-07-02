//https://www.codechef.com/problems/TODOLIST

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int count = 0;
		    while(n-->0){
		        if(sc.nextInt() >= 1000) count++;
		    }
		    System.out.println(count);
		}
	}
}
