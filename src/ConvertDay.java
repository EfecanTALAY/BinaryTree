import java.util.Scanner;

public class ConvertDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 7: ");
        int num = scanner.nextInt();

        if (num == 1)
            System.out.println("Day: Monday");
        else
            System.out.println("Invalid value");

        scanner.close();
    }
}

