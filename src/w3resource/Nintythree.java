package w3resource;

public class Nintythree {

	public static void main(String[] args) {
		int[] arr= {10,10,20,20,34,45};
    boolean found1010=false;
    boolean found2020=false;
   // while(found1010 != found2020) {
    for(int i=0;i<=arr.length-1;i++) {
    	if(arr[i]==10 && arr[i+1]==10)
    		found1010=true;
    	if(arr[i]==20 && arr[i+1]==20)
    		found2020=true;
    	
       if(found1010 != found2020)
    	System.out.print("both exist");
    }

	}

}

//please see question
//boolean is a data type havingvalue 0or1
//found1010 isa variable name
//why bothexist is printed twice???
//does the for loop runtwice for both the if conditions?