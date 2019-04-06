package w3resource;
import java.util.Scanner;
public class Asciivalue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		//charAt(0) function returns the first character in that string
		//next()returns the next input token as a string
		int ascii = ch;
		System.out.println("the ascii value of "+ ch + " is "+ ascii);

	}

}
// character input by the user is stored in ch, then ch is stored in an integer variable ascii.
//then when we print ascii variable ascii value is printed
//simple storing the characters in integer gives us the ascii value.