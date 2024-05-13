import java.util.Scanner;

public class Starpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();
        for (int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                if(j==i || j==rows-i+1){
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }
            }
        }
    }
}
