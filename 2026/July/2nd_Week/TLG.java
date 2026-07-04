import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		int playerScore1 = 0;
		int playerScore2 = 0;
		
		int sumPlayer1 = 0;
		int sumPlayer2 = 0;
		    
		int maxPlayer1 = Integer.MIN_VALUE;
		int maxPlayer2 = Integer.MIN_VALUE;
		
		while(t-->0){
		    playerScore1 += sc.nextInt();
		    playerScore2 += sc.nextInt();
		    
		    
		    
		    if(playerScore1 > playerScore2){
		        int cumulative = playerScore1-playerScore2;
		        maxPlayer1 = Math.max(maxPlayer1,cumulative);
		        sumPlayer1 = sumPlayer1+cumulative;
		    }else{
		        int cumulative = playerScore2-playerScore1;
		        maxPlayer2 = Math.max(maxPlayer2,cumulative);
		        sumPlayer2 = sumPlayer2+cumulative;
		    }
		    
		}
		if(maxPlayer1 > maxPlayer2){
		        System.out.println(1+" "+maxPlayer1);
		    }else{
		        System.out.println(2+" "+maxPlayer2);
		}
	}
}
