package w3resource;
import java .util.Scanner;
public class Andor {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if(b>=a && c>=b )
	{
		System.out.print("true");
	}
	else
	{
		System.out.print("false");
	}
}
}