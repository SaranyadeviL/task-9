import java.util.Scanner;

public class Readstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the string");
        String s = scanner.nextLine();
        String reversedString = "";
        for(int i = s.length()-1; i>=0; i--){
            reversedString += s.charAt(i);

        }
        System.out.println("Reversed String is:" + reversedString);
    }
}
