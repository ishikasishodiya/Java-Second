package w3resource;
import java.util.Scanner;
public class Hundred1 {

	public static void main(String[] args) {
		int count =0; int count1=0;
	Scanner sc =new Scanner(System.in);
	int arr[]= new int[5];
	for(int i =0 ; i<5;i++) {
		arr[i]= sc.nextInt();
	}
	for(int i=0;i<5;i++) {
		if(arr[i]==10)
			count++;
		if(arr[i]==20)
			count1++;
		
	}
while(count>count1) {
	System.out.println("true");
	break;
}
	}

}
