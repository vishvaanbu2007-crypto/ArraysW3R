import java.util.*;
public class q8{
    public static void main(String[] args){
        int[] arr=new int[5];
        int[] arr2=new int[5];
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements: ");
        for(i=0;i<5;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Original array: "+ Arrays.toString(arr));
        for(i=0;i<5;i++){
            arr2[i]=arr[i];
        }
        System.out.println("Copied array: "+ Arrays.toString(arr2));

    }
}