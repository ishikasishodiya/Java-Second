package w3resource;

public class ReverseString {

	public static void main(String[] args) {
		String c1= "hi how are you";
		String reverse="" ;
		
		for(int i=c1.length()-1;i>=0;i--)
		{
		 reverse = reverse+ c1.charAt(i);


	}
		System.out.print(reverse);
}
}
//point 1- (reverse = reverse+..) karna padega otherwise error.(ask) why
//i =c1.length()-1 karna padega -1 is imp because charAt ka index 0 se start hota hai and c1.length=14
//14 as an index do not exist,13 is the last index.