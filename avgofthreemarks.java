import java.util.*;
class avgofthreemarks {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Marks 1: ");
        int m1= sc.nextInt();
        System.out.println("Enter Marks 2: ");
        int m2= sc.nextInt();
        System.out.println("Enter Marks 3: ");
        int m3 = sc.nextInt();
        float total=(m1 + m2 + m3)/3;
        System.out.println("Average Marks: "+total);
    }
}
