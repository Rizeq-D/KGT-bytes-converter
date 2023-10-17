import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TheBytesConverter converter = new TheBytesConverter();

        System.out.println("Choose the conversion type:");
        System.out.println("1. Kilobytes to Megabytes");
        System.out.println("2. Megabytes to Kilobytes");
        System.out.println("3. Megabytes to Terabytes");
        System.out.println("4. Terabytes to Megabytes");
        System.out.println("5. Terabytes to Kilobytes");

        int choice = scanner.nextInt();
        double value;

        switch (choice) {
            case 1:
                System.out.print("Enter kilobytes: ");
                value = scanner.nextDouble();
                double megaBytes = converter.kiloBytesToMegaBytes((int) value);
                System.out.println(value + " kilobytes = " + megaBytes + " megabytes");
                break;
            case 2:
                System.out.print("Enter megabytes: ");
                value = scanner.nextDouble();
                int kiloBytes = converter.megaBytesToKiloBytes((int) value);
                System.out.println(value + " megabytes = " + kiloBytes + " kilobytes");
                break;
            case 3:
                System.out.print("Enter megabytes: ");
                value = scanner.nextDouble();
                double terabytes = converter.megaBytesToTerabytes((int) value);
                System.out.println(value + " megabytes = " + terabytes + " terabytes");
                break;
            case 4:
                System.out.print("Enter terabytes: ");
                value = scanner.nextDouble();
                double mega = converter.terabytesToMegaBytes(value);
                System.out.println(value + " terabytes = " + mega + " megabytes");
                break;
            case 5:
                System.out.print("Enter terabytes: ");
                value = scanner.nextDouble();
                double kilo = converter.terabytesToKiloBytes(value);
                System.out.println(value + " terabytes = " + kilo + " kilobytes");
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}

