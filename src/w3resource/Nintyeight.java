package w3resource;
import java.util.Scanner;
public class Nintyeight {
public static void main(String[] args) {
int count=0,count2 =0,count3=0;
Scanner sc = new Scanner(System.in);
System.out.print("enter the elements of array");
int arr[] = new int[6];
for(int j=0;j<6;j++) {
	arr[j]=sc.nextInt();
	}
for(int i=0; i<6;i++) {
	if(arr[i]==20) {
		count++;
	}
	
	if(arr[i]==20 && arr[i+1]==20 && arr[i+2]==20)
	{
		count2++;
	}
}
try {
	if(count2==1)
	throw new Exception( "thrown");
}
catch(Exception e) {
System.out.println("The 20 are three consecutive"+e);	
}
while(count==3 && count2==0 ) {
System.out.println("true three 20 not consecutive");
break;
}
}
}
