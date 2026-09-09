import java.util.Scanner;

public class ANDRES_Exercise2M2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter food item: ");
        String foodItem = input.nextLine();

        System.out.print("Enter category: ");
        String category = input.nextLine();

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        System.out.print("Enter serving size: ");
        int servingSize = input.nextInt();

        System.out.println("\nMENU ITEM RECORD");
        System.out.println("Item: " + foodItem);
        System.out.println("Category: " + category);
        System.out.println("Price: PHP " + price);
        System.out.println("Serving Size: " + servingSize);

        input.close();
    }
}