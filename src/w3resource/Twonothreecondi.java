package w3resource;
import java.util.Scanner;
public class Twonothreecondi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(a>b) {
			System.out.print(a);
		
	}
	else if(b>a)
	{
		System.out.print(b);
	}
	else if(a==b)
	{
		System.out.print(0);
	}
	else if(a%6==b%6 && a<b) {
		System.out.print(a);
	}
	else if(a%6==b%6 && a>b) {
		System.out.print(b);
	}

	}
}
