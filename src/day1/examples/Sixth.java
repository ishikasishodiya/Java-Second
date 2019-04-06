package day1.examples;
import java.util.*;
public class Sixth {
       public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=1;i<=t;i++) {
		long n = sc.nextInt();
		
		
		if(n>= -128 && n<=127)
		{
			System.out.println(n + " can be fitted in: " +"\n"+"* byte"+ "\n"+"* short"+"\n"+"* int"+"\n"+"* long");
			}
		else if(n>= -32768 && n<=32767)
		{
			System.out.println(n + " can be fitted in: " +"\n" + "* short" + "\n" + "* int" + "\n" + "* long");
	
		}
		else if(n>= - ((int) Math.pow(2,31)) && n<= (((int) Math.pow(2,31))-1))
		{
			System.out.println(n + " can be fitted in: " + "\n" + "* int" + "\n" + "* long");
	
		}
		else if(n>= - ((long) Math.pow(2,63)) && n<= (((long) Math.pow(2,63))-1))
		{
			
			System.out.println(n + "can be fitted in: " + "\n" +"* long");
		}
		else
		{
			System.out.println(n+" can't be fitted anywhere.");
		}
		}
	}
}
