package w3resource;
import java.util.Scanner;
public class Nintyseven2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count =0; int count2=0;int count3=0;
		int arr[] = new int[6];
		for(int i = 0;i<6;i++) {
			arr[i]= sc.nextInt();
			}
		System.out.println("enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 0;i<6;i++) {
			if(arr[i]==a&&arr[i+1]==b) {
				count++;
			}
			else if(arr[i]==a && arr[i+2]==b) {
				count2++;
				
			}
			else {
				count3++;
			}
		}
		while(count>=1) {
		System.out.println("the two numbers are consecutive");
		break;}
	while(count2>=1) {
		System.out.println("the two numbers have one other number in between");	
		break;
	}
	while(count3>=1) {
		System.out.println("the two numbers are not conse");	
		break;
	}	
	
	}

}
