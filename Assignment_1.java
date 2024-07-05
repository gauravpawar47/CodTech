import java.util.Scanner;

public class SimpleCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter first number (or -1 to exit): ");
            double num1 = scanner.nextDouble();
            if (num1 == -1)
            {
                break;
            }

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Select operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            double result = 0;
            boolean validOperation = true;

            switch (choice)
            {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0)
                    {
                        result = num1 / num2;
                    }
                    else
                    {
                        System.out.println("Error: Division by zero");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid choice");
                    validOperation = false;
            }

            if (validOperation)
            {
                System.out.println("Result: " + result);
            }
        }

        scanner.close();
        System.out.println("Calculator terminated.");
    }
}