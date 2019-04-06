package w3resource;

import java.util.Arrays;
//ask when b[0] is hello then why doesn't it work
public class Eightyfive {

	

	public static void main(String[] args) {
		String a="hello how are you";
	String[] b =a.split("\\s");
		
			System.out.print(b[0]=="hello");
			System.out.println(b[0]);
	//System.out.println(a.startsWith("how",6));
	}

}
//can directly print b[0]but not sop(b) there need to use Arrays.tostring


//System.out.println(a.startswith("hello");