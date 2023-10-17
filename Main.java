import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the conversion type:");
        System.out.println("1. Kilobytes to Megabytes");
        System.out.println("2. Megabytes to Kilobytes");
        System.out.println("3. Megabytes to Terabytes");
        System.out.println("4. Terabytes to Megabytes");
        System.out.println("5. Terabytes to Kilobytes");

        int choice = scanner.nextInt();
        double value;
        TheBytesConverter converter = new TheBytesConverter();

        switch (choice) {
            case 1:
                System.out.print("Enter kilobytes: ");
                value = scanner.nextDouble();
                System.out.println("Converting " + value + " kilobytes:");
                converter.printBytesConversions(value, "kilobytes");
                break;
            case 2:
                System.out.print("Enter megabytes: ");
                value = scanner.nextDouble();
                System.out.println("Converting " + value + " megabytes:");
                converter.printBytesConversions(value, "megabytes");
                break;
            case 3:
                System.out.print("Enter megabytes: ");
                value = scanner.nextDouble();
                System.out.println("Converting " + value + " megabytes:");
                converter.printBytesConversions(value, "megabytes");
                break;
            case 4:
                System.out.print("Enter terabytes: ");
                value = scanner.nextDouble();
                System.out.println("Converting " + value + " terabytes:");
                converter.printBytesConversions(value, "terabytes");
                break;
            case 5:
                System.out.print("Enter terabytes: ");
                value = scanner.nextDouble();
                System.out.println("Converting " + value + " terabytes:");
                converter.printBytesConversions(value, "terabytes");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
