package w3resource;
import java.util.Arrays;
import java.util.Scanner;

public class Nintyfive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String arr[] = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			
			arr[i]=String.valueOf(i);
			
			}
		System.out.print(Arrays.toString(arr));	
	}

}
