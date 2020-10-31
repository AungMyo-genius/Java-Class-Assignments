import java.util.Scanner;



public class App {

	public static void main(String[] args) {

		System.out.print("Enter number : ");
		Scanner in = new Scanner(System.in);
		byte count = in.nextByte();
		byte i,j;
		for( i = 0 ; i <= count ; i++){
		     for(j=1 ; j<=i; j++) {
		    	 System.out.print(" ");
		     }
		     for(j=(byte) (count-i); j>0; j--) {
		    	 System.out.print(j + " ");
		     }
		     System.out.println();
		     
		     
		  }	 
		
		
		
	     

} }
