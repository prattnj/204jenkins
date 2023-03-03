import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator started");

        while (true) {

            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0];
            if (command.equals("add")) {
                System.out.println(calculator.add(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
            } else if (command.equals("subtract")) {
                System.out.println(calculator.subtract(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
            } else if (command.equals("multiply")) {
                System.out.println(calculator.multiply(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
            } else if (command.equals("divide")) {
                System.out.println(calculator.divide(Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
            } else if (command.equals("fibonacci")) {
                System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(parts[1])));
            } else if (command.equals("binary")) {
                System.out.println(calculator.intToBinaryNumber(Integer.parseInt(parts[1])));
            } else if (command.equals("quit")) {
                break;
            } else {
                System.out.println("Unknown command");
            }

        }


    }

}
