package w3resource;

public class Largerstarr {

	public static void main(String[] args) {
		int[] arr= {29,37,47,27,92};
		if(arr[0]>arr[arr.length-1]&& arr[0]>arr[arr.length/2] ) {
			System.out.println(arr[0]);
			
		}
		else if(arr[arr.length-1]>arr[0]&&arr[arr.length-1]>arr[arr.length/2] ) {
			System.out.println(arr[arr.length-1]);
		}
		else {
			System.out.print(arr[arr.length/2]);
		}

	}

}
