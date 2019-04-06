package w3resource;
import java.util.Scanner;
public class Uppercase {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//sc.next();
	String a = sc.next();
	int space=0;
	//String a ="helo there g";
	//String upper="";
	// upper =upper+ Character.toUpperCase(a.charAt(0));
	
	for(int i=0;i<a.length();i++)
		
	{
		if(Character.isSpaceChar(a.charAt(i))) {
			
			//upper= upper + Character.toUpperCase(a.charAt(i++));
		space++;
		}
																							
		
	}
	
System.out.print(space);
	}

}
