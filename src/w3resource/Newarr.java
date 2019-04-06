package w3resource;

import java.util.Arrays;

public class Newarr {

	public static void main(String[] args) {
		int [] arr = {10,35,54};
		int[] arr2 = {23,78};
		int [] arr3= {arr[0],arr[arr.length-1]};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
		//cant print like this.
		//System.out.println(arr2);
		//System.out.println(arr3);
		

	}

}
