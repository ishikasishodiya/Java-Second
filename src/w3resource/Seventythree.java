package w3resource;
import java.util.Scanner;
public class Seventythree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		
		int x = s2.length();
		while(s1.length()<1) {
			System.out.print("#");
		}
		while(s2.length()<1) {
			System.out.print("#");
		}
		System.out.print(s1.charAt(0));
		System.out.print(s2.charAt(x-1));
		
	}

}
