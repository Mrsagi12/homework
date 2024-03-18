/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    
	    int sum = 0;
	    
	    for(int i = 1; i <= 5; i++){
	        System.out.println("Enter grade number "+i+": ");
	        int grade = scan.nextInt();
	        
	        sum += grade;
	    }
	    
	    System.out.println(sum / 5);
	}
}
