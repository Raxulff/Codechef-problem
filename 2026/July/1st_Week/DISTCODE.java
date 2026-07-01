/*
https://www.codechef.com/problems/DISTCODE
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
		    String input = sc.next();
		    List<String> list = new ArrayList<>();
		    for(int ind = 0;ind < input.length();){
		        
		        char ch1 = input.charAt(ind);
		        if(ind+1 >= input.length()){
		            break;
		        }
		        char ch2 = input.charAt(ind+1);
		        
		        String str = ch1+""+ch2;
		        if(!list.contains(str)){
		            list.add(str);
		        }
		        
		        ind = ind + 1;
		        
		    }
		    System.out.println(list.size());
		}
	}
}
