import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();
        int count = 1;
        for (int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.println(count + "");
                count++;
            }

        }
    }
}
