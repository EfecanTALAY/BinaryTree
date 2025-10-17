import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Coffee Shop Menu ----");
        System.out.println("A -> Americano -> $3.00");
        System.out.println("C -> Cappuccino -> $3.75");
        System.out.println("L -> Latte -> $4.00");
        System.out.println("E -> Espresso -> $2.50");
        System.out.println("--------------------------");
        System.out.print("Lütfen menü seçiminizi girin (A, C, L, E): ");

        String tempStr = scanner.nextLine().toUpperCase();

        char choice = ' ';
        if (!tempStr.isEmpty()) {
            choice = tempStr.charAt(0);
        }

        System.out.println("\n--- Sonuç ---");

        switch(choice){
            case 'A':
                System.out.println("Americano fiyatı: $3.00");
                break;

            case 'C':
                System.out.println("Cappuccino fiyatı: $3.75");
                break;

            case 'L':
                System.out.println("Latte fiyatı: $4.00");
                break;

            case 'E':
                System.out.println("Espresso fiyatı: $2.50");
                break;

            default:
                System.out.println("Invalid choice.");
                break;
        }

        scanner.close();
    }
}
