package w3resource;
import java.util.Scanner;
public class Factorcount {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int count =0;
	for(int i=1;i<=a;i++) {
		for(int j =1;j<=a;j++) {
			if(a == i*j) {
				count++;
			}
		}
	}
	System.out.print("total no of factors of that number are "+count);
	

	}

}
