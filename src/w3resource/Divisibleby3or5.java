package w3resource;

public class Divisibleby3or5 {

	public static void main(String[] args) {
		
		System.out.println("divisible by 3 is ");
		for(int i=1;i<=100;i++){
			
			
			  if(i%3==0) {
				System.out.print(i+";");
			}
		}
		System.out.println("\n"+"divisible by 5 is ");
for(int i=1;i<=100;i++){
			
			
			   if(i%5==0) {
				System.out.print(i+";");
			}
}
System.out.println("\n"+"divisible by 3 and5 is ");
for(int i=1;i<=100;i++){
	
	
			  if(i%3==0 && i%5==0) {
					System.out.print(i+";");	
		}
			  }
	}
	}

// we had to print that statement "divisible by .." only once so used three different for loops.
