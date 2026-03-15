import java.util.*;

public class q5{
    public static void main(String[] args){
        int sum=0;
        Scanner s = new Scanner(System.in);
        int[] arr=new int[5];
        int i,j,n;
        System.out.println("Enter number to be searched:");
        n=s.nextInt();
        System.out.println("Enter 5 integers: ");
        for(i=0;i<5;i++){
            arr[i]=s.nextInt();

        }
        for(j=0;j<5;j++){
            if(arr[j]==n){
                System.out.println("Element found! ");
            }
        }
}}