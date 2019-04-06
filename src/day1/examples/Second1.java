package day1.examples;

import java.util.Scanner;

public class Second1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2 != 0 || (n%2 == 0 &&(n>=6 && n<=20))) {
			System.out.println("Weird");
		}
		else
		{
			System.out.println("Not Weird");
}

	}
}
