package w3resource;

public class Arrfirstlastsame {

	public static void main(String[] args) {
		int [] arr={10,74,37,38,3};
		while(arr.length>2) {
		if(arr[0]== arr[arr.length-1]) {
			System.out.print("true");
		}
		else {
			System.out.print("false");
		}
	}
	}
}
