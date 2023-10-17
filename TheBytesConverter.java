public class TheBytesConverter {

    public void printBytesConversions(double value, String type) {
        if (value < 0) {
            System.out.println("Invalid value");
        } else {
            double kiloBytes, megaBytes, terabytes;

            switch (type) {
                case "kilobytes":
                    kiloBytes = value;
                    megaBytes = kiloBytesToMegaBytes(kiloBytes);
                    terabytes = megaBytesToTerabytes(megaBytes);
                    break;
                case "megabytes":
                    megaBytes = value;
                    kiloBytes = megaBytesToKiloBytes(megaBytes);
                    terabytes = megaBytesToTerabytes(megaBytes);
                    break;
                case "terabytes":
                    terabytes = value;
                    megaBytes = terabytesToMegaBytes(terabytes);
                    kiloBytes = megaBytesToKiloBytes(megaBytes);
                    break;
                default:
                    System.out.println("Invalid type");
                    return;
            }

            System.out.println(
                    value + " " + type + " = " + kiloBytes + " kilobytes = " + megaBytes + " megabytes = " + terabytes + " terabytes"
            );
        }
    }

    public int megaBytesToKiloBytes(double megaBytes) {
        return (int) Math.round(megaBytes * 1024);
    }

    public double kiloBytesToMegaBytes(double kiloBytes) {
        return kiloBytes / 1024;
    }

    public double megaBytesToTerabytes(double megaBytes) {
        return megaBytes / (1024 * 1024);
    }

    public double terabytesToMegaBytes(double terabytes) {
        return terabytes * (1024 * 1024);
    }
    public double terabytesToKiloBytes(double terabytes) {
        return terabytes * (1024 * 1024 * 1024);
    }

}

