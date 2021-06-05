package converter;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            var isFrom = true;
            switch (scanner.next().toLowerCase()) {
                case "/exit":
                    return;
                case "/to":
                    isFrom = false;
                case "/from":
                    System.out.printf("Enter %s: ", isFrom ? "a number in decimal system" : "source number");
                    final var number = scanner.next();
                    System.out.printf("Enter the %s base: ", isFrom ? "target" : "source");
                    final var radix = scanner.nextInt();
                    System.out.printf("Conversion%s result: ", isFrom ? "" : " to decimal");
                    System.out.println(isFrom ? new BigInteger(number).toString(radix) : new BigInteger(number, radix));
            }
        }
    }
}
