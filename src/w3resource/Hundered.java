package w3resource;
import java.util.Scanner;
public class Hundered {
public static void main(String[] args) {
	int count=0;
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[5];
		int arr2[] = new int[5];
		System.out.println("enter the elements of first element");
		for(int i=0;i<5;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("enter the elements of second element");
		for(int i=0;i<5;i++) {
			arr2[i]= sc.nextInt();
		}
		for(int j=0;j<5;j++)
		{
			for(int i=0; i<5;i++) {
		
			if(arr[j]==arr2[i] || arr[j]-arr2[i]-1==1 || arr2[i]-arr[j]==1) {
		count++;
			}
				
			}
		}
 {
		System.out.println(count);
	
	}
		
	}

}
