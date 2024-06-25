// 13.15
import java.math.BigInteger;
import java.util.Scanner;

public class TestRational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two rational numbers
        System.out.print("Enter the first rational number (numerator denominator): ");
        BigInteger num1 = input.nextBigInteger();
        BigInteger den1 = input.nextBigInteger();
        Rational rational1 = new Rational(num1, den1);

        System.out.print("Enter the second rational number (numerator denominator): ");
        BigInteger num2 = input.nextBigInteger();
        BigInteger den2 = input.nextBigInteger();
        Rational rational2 = new Rational(num2, den2);

        // Perform arithmetic operations
        Rational sum = rational1.add(rational2);
        Rational difference = rational1.subtract(rational2);
        Rational product = rational1.multiply(rational2);
        Rational quotient = rational1.divide(rational2);

        // Display results
        System.out.println(rational1 + " + " + rational2 + " = " + sum);
        System.out.println(rational1 + " - " + rational2 + " = " + difference);
        System.out.println(rational1 + " * " + rational2 + " = " + product);
        System.out.println(rational1 + " / " + rational2 + " = " + quotient);

        System.out.println(rational2 + " is " + rational2.doubleValue());
    }
}