package converter;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            final var command = scanner.next().toLowerCase();
            var isFrom = true;
            switch (command) {
                case "/exit":
                    return;
                case "/to":
                    isFrom = false;
                case "/from":
                    System.out.println(isFrom ? "Enter a number in decimal system:" : "Enter source number:");
                    final var number = scanner.next();
                    System.out.println(isFrom ? "Enter the target base:" : "Enter the source base:");
                    final var radix = scanner.nextInt();
                    System.out.print(isFrom ? "Conversion result: " : "Conversion to decimal result: ");
                    System.out.println(isFrom ? new BigInteger(number).toString(radix) : new BigInteger(number, radix));
            }
        }
    }
}
