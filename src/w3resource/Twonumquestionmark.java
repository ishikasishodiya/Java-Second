package w3resource;
import java.util.Scanner;
public class Twonumquestionmark {
static int func() {
	Scanner sc =new Scanner(System.in);
	int a =sc.nextInt();
	int b =sc.nextInt();
	if(a==b) {
		return 0;
	}
	else if(a%6==b%6 ) {
		return(a<b)  ? a :b;
	}
	else 
	{
		return(a<b)? a:b;
	}
}
	public static void main(String[] args) {
		System.out.print(func());

	}

}
