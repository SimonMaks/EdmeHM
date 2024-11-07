import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) {
        String[] parts = input.trim().split(" ");

        int number_1;
        try {
            number_1 = Integer.parseInt(parts[0]);

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Is not a number: " + parts[0]);
        }

        if (number_1 > 10 || number_1 < 1) {
            throw new NumberFormatException("Value must be between 1 and 10");
        }

        int number_2;
        try {
            number_2 = Integer.parseInt(parts[2]);

        } catch (NumberFormatException e) {
            throw new NumberFormatException("Is not a number: " + parts[2]);
        }

        if (number_2 > 10 || number_2 < 1) {
            throw new NumberFormatException("Value must be between 1 and 10");
        }

        String operation = parts[1];
        String result = "";

        switch (operation) {
            case "+" -> result = String.valueOf(number_1 + number_2);
            case "-" -> result = String.valueOf(number_1 - number_2);
            case "*" -> result = String.valueOf(number_1 * number_2);
            case "/" -> {
                if (number_2 == 0) {
                    throw new ArithmeticException("Division by zero");
                } else {
                    result = String.valueOf(number_1 / number_2);
                }
            }
            default -> throw new ArithmeticException("Invalid operation");
        }

        return result;
    }
}