package w3resource;
import java.util.Scanner;
public class Reverseword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	String rev ="";
	for(int i=s1.length()-1;i>=0;i--) {
		rev =rev + s1.charAt(i);
	}
	System.out.print(rev);
	}
}