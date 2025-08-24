import java.util.*;
public class agecalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Birth Year: ");
        int year = sc.nextInt();
        System.out.println("Your Age: "+ (2025 - year));
    }
}
