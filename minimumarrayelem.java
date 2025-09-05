import java.util.Scanner;

public class minimumarrayelem {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of element in the Array: ");
        int a = sc.nextInt();
        int check=0;
        int[] arr= new int[a];
        for(int i=0;i<a;i++){
            System.out.println("Enter the Number of Elements in the Array: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]<check){
                check=arr[i];
            }
        }
        System.out.println("Greatest Number in the Array is: "+check);

}
}
