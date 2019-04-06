package w3resource;
import java.util.*;
public class Printfirsthalfstring {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	for(int i=0;i<s1.length()/2;i++) {
		System.out.print(s1.charAt(i));
	}
	
	}

}
