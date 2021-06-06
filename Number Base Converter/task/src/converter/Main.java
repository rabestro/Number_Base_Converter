package converter;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            final var params = scanner.nextLine().split(" ");
            if ("/exit".equalsIgnoreCase(params[0])) {
                return;
            }
            final var base = Arrays.stream(params).mapToInt(Integer::parseInt).toArray();
            while (true) {
                System.out.printf("Enter number in base %d to convert to base %d (To go back type /back) ", base[0], base[1]);
                final var number = scanner.nextLine();
                if ("/back".equalsIgnoreCase(number)) {
                    break;
                }
                System.out.println("Conversion result: " + new BigInteger(number, base[0]).toString(base[1]));
            }
        }
    }
}
