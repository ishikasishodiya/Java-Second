package day1.examples;

import java.util.Scanner;

public class Nineb {

	
		static Scanner sc =new Scanner(System.in);
		//static initialization
		static int B = sc.nextInt();
		static int H = sc.nextInt();
		static boolean flag;
		
		//static initialization block
		static 
		{
			
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
		
		//here flag need not to be put=true as we defined it outside the static block
	     if(flag)
				{
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main

	}//end of class

	
