import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner intScanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);
        int a, b;
        a = intScanner.nextInt();
        b = intScanner.nextInt();

        String operator;
        operator = strScanner.next();
        if (operator.equals("+")) {
            System.out.println(a + b);
        }
        if (operator.equals("-")) {
            System.out.println(a - b);
        }
        else if (operator.equals("*")) {
            System.out.println(a * b);
        }
        else if (operator.equals("/")) {
            System.out.println(a / b);
        }
        else if (operator.equals("%")) {
            System.out.println(a % b);
        }
        else {
            System.out.println("Invalid operator, not sigma");
        }

    }

}