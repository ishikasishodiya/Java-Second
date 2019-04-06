package w3resource;
import java.util.Scanner;
public class Eigthyseven {
//ask
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x=0;
		String a = Integer.toString(n);
		for(int i=0;i<=a.length()-1;i++) {
			char b=a.charAt(i);
			int c=Character.getNumericValue(b);
			x=x+c;
			
		}
		System.out.print(x);
		String[] number={"zero","one","two","three","four","five","six","seven","eight","nine"};
		
		String z=Integer.toString(x);
		for(int i=0;i<=z.length()-1;i++) {
		System.out.print(number[z.charAt(i)]);
	}
	}
}
//int a=Character.getNumericValue(c);