import java.util.*;

public class q4{
    public static void main(String[] args){
        int sum=0;
        Scanner s = new Scanner(System.in);
        int[] arr=new int[5];
        int i;
        System.out.println("Enter 5 integers: ");
        for(i=0;i<5;i++){
            arr[i]=s.nextInt();
            sum+=arr[i];

        }
        int avg=sum/5;
        System.out.println("average of elements in the arrays is: "+avg);
        

    }
}