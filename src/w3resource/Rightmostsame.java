package w3resource;
import java.util.*;
public class Rightmostsame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = a%10;
		int y = b%10;
		int z = c %10;
		
		if(x==y || y == z || z==x) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		

	}

}
