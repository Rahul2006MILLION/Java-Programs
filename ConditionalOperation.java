import java.util.*;

public class ConditionalOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String result = (n > 0) ? "Positive" : "Negative/Zero";
        System.out.println(result);
    }
}

