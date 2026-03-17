import java.util.*;

public class q9{
    public static void main(String[] args){
        int sum=0;
        Scanner s = new Scanner(System.in);
        int[] arr=new int[5];
        int i,j,n,k;
        System.out.println("Enter 5 integers: ");
        for(i=0;i<5;i++){
            arr[i]=s.nextInt();

        }
        System.out.println("Original array: "+ Arrays.toString(arr));
        
        System.out.println("Enter number to be entered: ");
        n=s.nextInt();

        System.out.println("Enter index of number to be entered: ");
        k=s.nextInt();
        arr[k]=n;
        System.out.println("New array: "+ Arrays.toString(arr));
        
        }

}