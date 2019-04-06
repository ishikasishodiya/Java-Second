package w3resource;

import java.util.Arrays;

public class Swapinarr {

	public static void main(String[] args) {
		int[] arr= {20,34,56,65};
		int x=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=x;
		System.out.print(Arrays.toString(arr));
	}

}
