import java.util.Scanner;

public class ANDRES_Exercise3M2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter vehicle brand: ");
        String brand = input.nextLine();

        System.out.print("Enter vehicle model: ");
        String model = input.nextLine();

        System.out.print("Enter plate number: ");
        String plateNumber = input.nextLine();

        System.out.print("Enter manufacturing year: ");
        int manufacturingYear = input.nextInt();

        System.out.print("Enter engine displacement: ");
        double engineDisplacement = input.nextDouble();

        System.out.println("\nVEHICLE INFORMATION");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Plate: " + plateNumber);
        System.out.println("Year: " + manufacturingYear);
        System.out.println("Engine: " + engineDisplacement + " L");

        input.close();
    }
}
