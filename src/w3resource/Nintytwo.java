package w3resource;

public class Nintytwo {

	public static void main(String[] args) {
		int count=0;
		int count2=0;
		int[] arr= {10,37,47,3,5,3};
		for(int i=0;i<=arr[arr.length-1];i++) {
			if(arr[i]%2==0) {
				count++;
			}
			else{
				count2++;
				System.out.println(arr[i]);
			}
		}
		System.out.println("no of even numbers are "+count);
		System.out.println("no of odd numbers are "+count2);
		
		
		
		
	}
}