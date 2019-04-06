package w3resource;
import java.util.Scanner;
public class Seventythreeb {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String a = sc.next();
	String b = "";
	int x = b.length();
	String result="";
	result += (a.length()>=1) ? a.charAt(0) : ("#");
	result += (b.length()>=1) ? b.charAt(x-1) : ("#");
	System.out.print(result);
	}

}
