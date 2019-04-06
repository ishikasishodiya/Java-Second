package w3resource;

public class Allcombinationofnum {

	public static void main(String[] args) {
		int amount=0;
		for(int i=1;i<=4;i++)
		{
		for(int j=1;j<=4;j++)
		{
		for(int k=1;k<=4;k++){

		if(j!=i && i!=k && k!=j){
		System.out.println(i+" "+j+" "+k);
		amount++;
		}

		}
		}
		}
		System.out.println(amount);	
		

	}

}
//to print all unique combination of numbers 1,2,3,4 in three digit and calculating the no of unique 
//numbers.
