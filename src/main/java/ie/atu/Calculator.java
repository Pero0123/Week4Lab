package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main (String[] args)
    {
        add();
        subtract();
        multiply();
        divide();
    }


    public static void add()
    {
        //asks user for first number
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        //asks user for second number
        System.out.println("Please enter your second number");
        int secondNumber = inputs.nextInt();

        //adds the two numbers and prints the total
        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);

    }

    public static void subtract()
    {
        //promst user for first number
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        //promts user for second number
        System.out.println("Please enter your second number");
        int secondNumber = inputs.nextInt();

        //subtracts the numbers and prints total
        int total = firstNumber - secondNumber;
        System.out.println("The total is " + total);

    }

    public static void multiply()
    {
        //promst user for first number
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        //promts user for second number
        System.out.println("Please enter your second number");
        int secondNumber = inputs.nextInt();

        //multiplys the two numbers and prints the product
        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);

    }

    public static void divide()
    {
        //promts user for first number
        System.out.println("Please enter your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        //promts user for second number
        System.out.println("Please enter your second number");
        int secondNumber = inputs.nextInt();

        //divides first number by second number and prints answer
        float total = (float)firstNumber / secondNumber;
        System.out.println("The total is " + total);

    }
}
