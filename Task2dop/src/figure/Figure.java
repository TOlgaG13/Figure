package figure;
import java.util.Scanner;
public class Figure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int w;
		System.out.println("Input w:");
		w=sc.nextInt();
		
		 for (int i = 0; i < w / 2 + 1; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < w - 2 * i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Нижня частина
	        for (int i = w / 2 - 1; i >= 0; i--) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j < w- 2 * i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}				
	
	
		



