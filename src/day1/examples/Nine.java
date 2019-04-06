package day1.examples;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Nine {
	static Scanner sc =new Scanner(System.in);
	//static initialization
	static int B = sc.nextInt();
	static int H = sc.nextInt();
	
	//static initialization block
	static 
	{
		boolean flag;
		//when flag declared inside static block ,will not be considered as initialized in main()
		//even variables should be defined outside static block.
        
		  if ((B <= 0 && H <= 0) || (B>=0  && H>=0)) {
	            flag = true;
	        }
	       else if ((B >= 0 && H <= 0) || (B <= 0 && H >= 0)) {
	            System.out.print("java.lang.Exception: Breadth and height must be positive");
	        }   


	 
	}
public static void main(String[] args){
	
	boolean flag;
     if(flag=true)
			{
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
