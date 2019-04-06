package w3resource;
import java.util.Scanner;
public class Threenothreecondi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if((a>=20 && (a<(b-c)||(a<(c-b))) ||(b>=20 && (b<(a-c)||(b<(c-a))) ||(c>=20 && (c<(b-a)||(c<(c-a)))))))
				{
			System.out.print("true");
		}
		else {
			System.out.print("false");	
		}
	}

}
