package w3resource;
import java.util.Scanner;
public class Pattern1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int a = sc.nextInt();
		 for(int i = 1;i<=10;i++){
		   int res = a*i;
		   System.out.println(a+" " + "x"+" "+i+" "+"="+" "+res);
		 }

	}

}
