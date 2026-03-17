import java.util.*;
public class q10{
    public static void main(String[] args){
        int[] arr=new int[5];
        Scanner s=new Scanner(System.in);
        int i;
        System.out.println("Enter 5 elements: ");
        for(i=0;i<5;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Min number in array is: "+arr[0]);
        System.out.println("Max number in array is: "+arr[4]);
}}