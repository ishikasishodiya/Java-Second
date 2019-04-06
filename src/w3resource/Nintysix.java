package w3resource;
import java.util.Arrays;
import java.util.Scanner;
public class Nintysix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
	int arr[] = new int[6];
	for(int i =0;i<6;i++) {
		arr[i]= sc.nextInt();
		
	}
	System.out.println(Arrays.toString(arr));
	for(int i=0;i<=5;i++) {
		for(int j=i;j<=5;j++) {
			if((arr[i]==10 && arr[j]==20) ||arr[i]==10 ) 
				a++;
			
			}
	}
	while(a>=1) {
		System.out.println("true");
		break;
	}
	

	}

}
