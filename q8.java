import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minGrade = Integer.MAX_VALUE;
        int maxGrade = Integer.MIN_VALUE;
        
        System.out.println("Enter 7 grades:");
        for (int i = 0; i < 7; i++) {
            int grade = scanner.nextInt();
            if (grade < minGrade) {
                minGrade = grade;
            }
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }

        System.out.println("Minimum grade: " + minGrade);
        System.out.println("Maximum grade: " + maxGrade);
    }
}
