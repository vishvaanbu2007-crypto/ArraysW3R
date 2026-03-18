import java.util.*;
public class q18{
    public static void main(String[] args){
        int[] arr=new int[5];
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements: ");
        for(i=0;i<5;i++){
                arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second largest element in array is: "+arr[3]);
        
    }
}