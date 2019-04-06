package w3resource;
import java.util.Scanner;
public class Substitutestring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		if(s1.length()>3)
		{
			System.out.println(s1.substring(0,3));
			
		}
		else if(s1.length()==1) {
			System.out.print(s1+"##");
		}
		else {
			System.out.print(s1+"#");
		}
	}

}
