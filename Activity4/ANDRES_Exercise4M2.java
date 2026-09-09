import java.util.Scanner;

public class ANDRES_Exercise4M2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Gets the hotel guest information
        System.out.print("Guest name: ");
        String guest = scan.nextLine();

        System.out.print("Room number: ");
        int roomNo = scan.nextInt();

        System.out.print("Number of nights: ");
        int nights = scan.nextInt();

        System.out.print("Room rate: ");
        double rate = scan.nextDouble();

        System.out.println();
        System.out.println("HOTEL GUEST RECORD");
        System.out.println("Guest: " + guest);
        System.out.println("Room: " + roomNo);
        System.out.println("Nights: " + nights);
        System.out.println("Room Rate: PHP " + rate);

        scan.close();
    }
}