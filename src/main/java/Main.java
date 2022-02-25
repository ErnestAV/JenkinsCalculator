import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator App!");
        System.out.println("Usage:\n - add [#1] [#2]\n - subtract [#1] [#2]\n - multiply [#1] [#2]\n" +
                " - divide [#1] [#2]\n - fibonacci [# to find]\n - binary [# int to convert to binary]\n"
                + "- -1 to finish");

        Scanner scan = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Enter command: ");
        String command = scan.next().toLowerCase(Locale.ROOT);

        while (!Objects.equals(command, "-1")) {
            if ("add".equals(command)) {
                int a = Integer.parseInt(scan.next());
                int b = Integer.parseInt(scan.next());

                System.out.println(calculator.add(a, b));
            }
            if ("subtract".equals(command)) {
                int a = Integer.parseInt(scan.next());
                int b = Integer.parseInt(scan.next());

                System.out.println(calculator.subtract(a, b));
            }
            if ("divide".equals(command)) {
                int a = Integer.parseInt(scan.next());
                int b = Integer.parseInt(scan.next());

                System.out.println(calculator.divide(a, b));
            }
            if ("fibonacci".equals(command)) {
                int toFind = Integer.parseInt(scan.next());

                System.out.println(calculator.fibonacciNumberFinder(toFind));
            }
            if ("binary".equals(command)) {
                int toConvert = Integer.parseInt(scan.next());

                System.out.println(calculator.intToBinaryNumber(toConvert));
            }
            System.out.println("Enter command: ");
            command = scan.next().toLowerCase(Locale.ROOT);
        }

        System.out.println("Thanks for using our Calculator!");
    }
}
