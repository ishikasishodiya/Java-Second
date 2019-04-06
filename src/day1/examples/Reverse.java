package day1.examples;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to be reversed: ");
		
	
		int i = sc.nextInt();
		//integer converted to string
		String s1 =Integer.toString(i);
		System.out.println("the reversed number is: ");
		
		for(int s=0;s<s1.length();s++)
		{
			int k = i%10;
			System.out.print(k);
			i= i/10;
			
			
		}
		
		/*int k = i%10;
		System.out.print("the reversed number is: ");
		System.out.print(k);
		int a = i/10;
		int b = a%10;
		System.out.print(b);
		int c = a/10;
		int d = c%10;
		System.out.print(d);*/
		}

}
