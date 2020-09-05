import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        System.out.println("please provide first number");

        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();

        System.out.println("Please provide second number");
        int number2 = scanner.nextInt();

        System.out.println("Please enter equal sign");
        char equalSign = scanner.next().charAt(0);


        switch (equalSign) {

            case '+':
                System.out.println("The result of adding is " + (number1 + number2));
                break;

            case '-':
                System.out.println("The result of the substraction is " + (number1 - number2));
                break;

            case '/':
                System.out.println("The result of dividing is " + (number1 / number2));
                break;

            case '*':
                System.out.println("The result of multiplication is " + (number1 * number2));
                break;

            default:
                System.out.println("This is an unknown operation");
        }

    }



}







