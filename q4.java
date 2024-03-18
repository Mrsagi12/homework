import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int numCopy = number;
        int digitSum = 0;
        
        while (numCopy > 0) {
            digitSum += numCopy % 10;
            numCopy /= 10;
        }
        
        System.out.println("Sum of digits of " + number + " is: " + digitSum);
    }
}
