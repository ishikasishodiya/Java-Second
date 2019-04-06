package w3resource;

import java.util.Arrays;

public class Nintyfour {

	public static void main(String[] args) {
		int j=0; int count=0;
		int[] arr= {17,66,3,5,7,12};
		int arr2[]= new int[arr.length];
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2!=0) {
				//j++;
				while(j<=arr.length-1) {
				arr2[j]= arr[i];	
				break;	}j++;
				//break;
				count=j;
				}
			
			}
		for(int i=0;i<=arr.length-1;i++) {
			if(arr[i]%2==0) {
				while(count<=arr.length-1) {
					arr2[count]=arr[i];
					break;
				}count++;
			}
		}
				
		
System.out.print(Arrays.toString(arr2));
	}
}
//solved
//earlier i wrote j++ before while then this problem occured.
//check code 7 not printing.
//odd number ka last vala print nhi kar raha hai
