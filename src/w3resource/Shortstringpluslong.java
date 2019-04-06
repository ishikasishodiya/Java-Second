package w3resource;

public class Shortstringpluslong {

	public static void main(String[] args) {
		String s1= "hello";
		String s2 ="ishika";
		if(s1.length()<s2.length()) {
			System.out.print(s1+s2+s1);
		}
		else {
			System.out.print(s2+s1+s2);
		}
	}

}
