import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // input format: month, room rent per day, no.of days stayed
        int month = scanner.nextInt();
        double roomRent = scanner.nextDouble();
        int days = scanner.nextInt();
        double total;

        //check its peak season using switch statement
        switch(month) {
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");

                //Roomrent is 20% higher during peak seasons
                roomRent *= 1.2;
        }
        //calculate the total cost
        total = roomRent * days;
        System.out.println("Total cost for the stay: $" + total);
        scanner.close();

        }
    }

