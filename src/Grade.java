import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = scanner.nextInt();
        char grade;
        if (marks >=90 && marks <=100){
            grade = 'A';
        } else if (marks>=80 && marks <=89) {
            grade = 'B';
        } else if (marks >=70 && marks <=79) {
            grade = 'C';
        } else if (marks >=60 && marks <=69) {
            grade = 'D';
        } else if (marks >=50 && marks <=59) {
            grade = 'E';
        } else if (marks <50 ) {
            grade = 'F';
        }
        else{
            grade = 'I';
        }
        System.out.println("your grade is \t" + grade);
    }
}
