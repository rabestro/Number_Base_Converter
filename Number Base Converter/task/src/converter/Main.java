package converter;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.println("Enter number in decimal system:");
        final var number = new BigInteger(scanner.nextLine());

        System.out.println("Enter target base:");
        final var radix = scanner.nextInt();

        System.out.println("Conversion result:");
        System.out.println(number.toString(radix));
    }
}
