
import java.util.Scanner;



public class App {

	public static void main(String[] args) {

		System.out.print("Enter number : ");
		Scanner in = new Scanner(System.in);
		byte count = in.nextByte();
		byte i,j,x;
		for( i = 1 ; i <= count ; i++){
		      for( j=0; j < count-i; j++){
		        System.out.print(" ");
		      }
		      for( x = 1; x <= i; x++){
		        System.out.print(x + " ");
		      }
		      System.out.println();
		    }                                
		  }	
		
		
		
	     

}
