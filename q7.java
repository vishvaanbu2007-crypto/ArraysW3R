import java.util.*;

public class q7{
    public static void main(String[] args){
        int sum=0;
        Scanner s = new Scanner(System.in);
        int[] arr=new int[5];
        int i,j,n;
        System.out.println("Enter 5 integers: ");
        for(i=0;i<5;i++){
            arr[i]=s.nextInt();

        }
        System.out.println("Enter number to be deleted:");
        n=s.nextInt();
        
        int ei=0;
        for(j=0;j<5;j++){
            if(arr[j]==n ){
              ei=j;
                break;
                
            }}
            for(j=ei;j<4;j++){
            arr[j]=arr[j+1];
                
                
            }
            System.out.println("Truncated array: ");
                for(j=0;j<4;j++){
            System.out.println(arr[j]);
                
                
            }
        }

}