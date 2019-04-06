package w3resource;

import java.util.Arrays;

public class Arrayrotate {

	public static void main(String[] args) {
		int[] arr= {10,28,37};
		int [] arr2= {arr[1],arr[2],arr[0]};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}

}
