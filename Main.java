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
        System.out.println("Enter 'stop' to exit.");

        while (true) {
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("stop")) {
                break;
            }

            int type;
            double value;

            try {
                type = Integer.parseInt(choice);

                if (type < 1 || type > 5) {
                    System.out.println("Invalid choice. Please enter a valid choice or 'stop' to exit.");
                    continue;
                }

                System.out.print("Enter value: ");
                value = scanner.nextDouble();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid choice or 'stop' to exit.");
                continue;
            }

            switch (type) {
                case 1:
                    double megaBytes = converter.kiloBytesToMegaBytes((int) value);
                    System.out.println(value + " kilobytes = " + megaBytes + " megabytes");
                    break;
                case 2:
                    int kiloBytes = converter.megaBytesToKiloBytes((int) value);
                    System.out.println(value + " megabytes = " + kiloBytes + " kilobytes");
                    break;
                case 3:
                    double terabytes = converter.megaBytesToTerabytes((int) value);
                    System.out.println(value + " megabytes = " + terabytes + " terabytes");
                    break;
                case 4:
                    double mega = converter.terabytesToMegaBytes(value);
                    System.out.println(value + " terabytes = " + mega + " megabytes");
                    break;
                case 5:
                    double kilo = converter.terabytesToKiloBytes(value);
                    System.out.println(value + " terabytes = " + kilo + " kilobytes");
                    break;
                default:

                    System.out.println("Invalid choice. Please enter a valid choice or 'stop' to exit:");

                    System.out.println("Invalid choice. Please enter a valid choice or 'stop' to exit.");

            }
        }
    }
}


