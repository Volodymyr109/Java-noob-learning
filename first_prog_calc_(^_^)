import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char operator;
        double num1, num2, res;

        Scanner input = new Scanner(System.in);

        System.out.println("What i have to do? +, -, *, or / ");
        operator = input.next().charAt(0);

        System.out.println("Enter Num 1: ");
        num1 = input.nextDouble();

        System.out.println("Enter Num 2: ");
        num2 = input.nextDouble();

        switch (operator) {

            case '+':
                res = num1 + num2;
                System.out.println("Results: " + num1 + " + " + num2 + " = "+ res);
                break;

            case '-':
                res = num1 - num2;
                System.out.println("Results: " + num1 + " - " + num2 + " = "+ res);
                break;

            case '*':
                res = num1 * num2;
                System.out.println("Results: " + num1 + " * " + num2 + " = "+ res);
                break;

            case '/':
                res = num1 / num2;
                System.out.println("Results: " + num1 + " / " + num2 + " = "+ res);
                break;

            default:
                System.out.println("Invalid input!");
                break;
        }

    input.close();
    }
}
