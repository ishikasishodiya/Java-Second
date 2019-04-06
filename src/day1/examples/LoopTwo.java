package day1.examples;
import java.util.*;

public class LoopTwo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
        	//t indicate how many line of input we want
           double a = in.nextDouble();
            double b = in.nextDouble();
            double n = in.nextDouble();
            //i vaali for loop ko dont close,close at end otherwise a,b,n ka input phirse expect hoga.
        
        double res=0;

      for(int j=0; j < n; j++ )
        {
        		
       res = res + (double)  (Math.pow(2,j)*b);
            //pure par (int) lagaya
            System.out.print(res+a +" ");
            //res mai a add karne se theek ans aya, uper vale res mai add kia toh nhi aya
	}
        System.out.print(" ");    
	}
}
}
