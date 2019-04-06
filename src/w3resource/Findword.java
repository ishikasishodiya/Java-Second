package w3resource;
import java.util.*;
public class Findword {
    public static void main(String[] args){	
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a Sentence: ");
	 String a = sc.nextLine();
	 String[] words = a.split("\\s");//splits the string based on whitespace  
	//using java foreach loop to print elements of string array 
	// for(String h : words) {
		//System.out.println(h);
	//}
	 
	  System.out.println("Penultimate word: "+words[words.length - 2]);
	 }			
}

