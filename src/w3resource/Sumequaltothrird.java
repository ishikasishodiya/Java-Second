package w3resource;
import java.util.Scanner;
public class Sumequaltothrird {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int res = a+b;
		if(res==c) {
			System.out.println("the resulis:true");
		}
		else {
			System.out.println("the resulis:false");
		}
			
	}

}
