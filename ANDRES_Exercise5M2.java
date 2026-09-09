import java.util.Scanner;

public class ANDRES_Exercise5M2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Phone brand: ");
        String phoneBrand = scan.nextLine();

        System.out.print("Phone model: ");
        String phoneModel = scan.nextLine();

        System.out.print("RAM capacity in GB: ");
        int ramCapacity = scan.nextInt();

        System.out.print("Storage capacity in GB: ");
        int storageCapacity = scan.nextInt();

        System.out.print("Phone price: ");
        double phonePrice = scan.nextDouble();

        System.out.println();
        System.out.println("SMARTPHONE SPECIFICATION");
        System.out.println("Brand: " + phoneBrand);
        System.out.println("Model: " + phoneModel);
        System.out.println("RAM: " + ramCapacity + " GB");
        System.out.println("Storage: " + storageCapacity + " GB");
        System.out.println("Price: PHP " + phonePrice);

        scan.close();
    }
}