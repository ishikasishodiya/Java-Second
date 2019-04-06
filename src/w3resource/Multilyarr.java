package w3resource;

import java.util.Arrays;

public class Multilyarr {

	public static void main(String[] args) {
		int[] arr= {1,5,6,4,7};
		int[] arr2= {4,2,3,5,8};
		int[] arr3= {arr[0]*arr2[0], arr[1]*arr2[1],arr[2]*arr2[2],arr[3]*arr2[3],arr[4]*arr2[4]};
	System.out.print(Arrays.toString(arr3));
	}

}
