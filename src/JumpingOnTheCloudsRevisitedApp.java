// My solution to the HackerRank.com problem "Jumping On The Clouds: Revisited."
// https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem

import java.util.Scanner;

public class JumpingOnTheCloudsRevisitedApp {
	
    	static int jumpingOnClouds(int[] c, int k) {

    		int finalE = 100;
    		for(int i = 0; i < c.length; i+=k) {
    			finalE--;
    			if(c[i] == 1) {
    				finalE -=2;  				
    			}
    			System.out.println("E = "+finalE);
    		}  		
    		return finalE;
    	}
	   public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.print("Enter number of clouds, n (integer 2-25): "); 
	        int n = in.nextInt();
	        System.out.print("Enter number of 'jump size', k, such that n % k = 0: "); 
	        int k = in.nextInt();
	        int[] c = new int[n];
	        c[0]= 0;
	        System.out.println("Note: The clouds numbering starts at 0. The value for cloud #0 is always zero.");
	        for(int c_i = 1; c_i < n; c_i++){
	            System.out.print("Enter a '0'('normal cloud') or '1' ('thounder cloud') for cloud #"+ (c_i)+": "); 
	            c[c_i] = in.nextInt();
	        }
	        int result = jumpingOnClouds(c, k);
	        System.out.println("Final E ="+result);
	        in.close();
	    }
}
