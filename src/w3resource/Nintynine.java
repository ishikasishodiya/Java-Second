package w3resource;
import java.util.Scanner;
public class Nintynine {
	public static void main(String args[]) {
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		System.out.println("enter the number of arrays");
		
int arr[] = new int[n];
for(int i=0;i<n;i++) {
	arr[i]= sc.nextInt();
	
}
System.out.println("enter the number that appear adjacently");
int a = sc.nextInt();
for(int i=0;i<n-1;i++) {
	if(arr[i]==a && arr[i+2]==a) {
		count++;
	}
	}
while(count >= (n/2)-1) {
	System.out.print("true");
	break;
	
}
	}


}
