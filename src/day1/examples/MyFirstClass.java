package day1.examples;

import java.util.Scanner;

public class MyFirstClass {

	public static void main(String[] args) {
		System.out.println("================================");
		for(int i=1; i<=3;i++) {
			Scanner sc = new Scanner(System.in);
			
			String b = sc.next();
			int a = sc.nextInt();
			System.out.print(b);
			String s1 = Integer.toString(a);
			if(s1.length() == 2)
			{
			System.out.print("        0"+a);
			}
			else if(s1.length() == 3)
			{
				System.out.print("        "+a);
			}
			else {
			System.out.print("        00"+a);
			}
			                                 
		}
		System.out.println("================================");
	}

}
