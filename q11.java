import java.util.*;
public class q11{
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
        int j;
        for(i=0,j=4;j>=0 && i<5;i++,j--){
            arr2[j]=arr[i];
          
        }
        System.out.println("reversed array: "+ Arrays.toString(arr2));

    }
}