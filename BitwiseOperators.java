import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter second integer: ");
        int b = sc.nextInt();

        System.out.println("a & b = " + (a & b) + " (Binary: " + Integer.toBinaryString(a & b) + ")");
        System.out.println("a | b = " + (a | b) + " (Binary: " + Integer.toBinaryString(a | b) + ")");
        System.out.println("a ^ b = " + (a ^ b) + " (Binary: " + Integer.toBinaryString(a ^ b) + ")");
    }
}


