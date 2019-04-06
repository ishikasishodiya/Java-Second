package w3resource;
import java.util.Scanner;
public class Countletters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//	String s1= "hey everyone 2.0974 is here";
		String s1 =sc.nextLine();
		int letter=0;
		int digit=0;
		int space=0;
		int others=0;
		for(int i =0;i<s1.length();i++) {
			if(Character.isLetter(s1.charAt(i)))
			{
				letter++;
				
			}
			else if(Character.isDigit(s1.charAt(i))) {
				digit++;
			}
		
			else if(Character.isSpaceChar(s1.charAt(i))) {
			space++;	
			}
			else {
				others++;
			}
		}
		
System.out.println("the letters are: "+letter);
System.out.println("the digits are: "+digit);
System.out.println("the space are: "+space);
System.out.println("the others char are: "+others);
	}

}
