import java.util.*;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int key = sc.nextInt();

        boolean found = false;
        for(int x: a){
            if(x == key) found = true;
        }

        System.out.println(found ? "Found" : "Not Found");
    }
}

