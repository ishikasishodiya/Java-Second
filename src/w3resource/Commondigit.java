package w3resource;
import java.util.Scanner;
public class Commondigit {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		if(a>=25&&b<=75) {
		String s1 = Integer.toString(a);
		String s2 = Integer.toString(b);
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++)
			{
				if(s1.charAt(i)== s2.charAt(j))	
{
					System.out.print("true");
	
}
			}
		}
		
		
	}
		else {
			System.out.print("sorry");
		}
	}
}
