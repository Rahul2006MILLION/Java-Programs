public class numg50 {
    public static void main(String[] args){
        int[] arr={10,11,12,50,51,56,45,35,59};
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>50){
                count+=1;
            }
        }
        System.out.println("Numbers Greater than 50: " +count);
    }
    
}
