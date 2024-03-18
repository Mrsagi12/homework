import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int wordCount = 0;
        
        while (true) {
            String word = scanner.next();
            if (word.equals("enter")) {
                break;
            }
            wordCount++;
        }
        
        System.out.println("Total number of words entered: " + wordCount);
    }
}
