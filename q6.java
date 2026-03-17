import java.util.*;

public class q6{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        int[] arr=new int[5];
        int i,j,n;
        System.out.println("Enter number whose index is to be found: ");
        n=s.nextInt();
        System.out.println("Enter 5 integers: ");
        for(i=0;i<5;i++){
            arr[i]=s.nextInt();

        }
        for(j=0;j<5;j++){
            if(arr[j]==n){
                System.out.println(" Index of integer is: "+j );
            }
        }
}}