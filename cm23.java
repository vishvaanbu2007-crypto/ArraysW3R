import java.util.*;
public class cm23{
    public static void main(String[] args){
        int[][] arr=new int[3][3];
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr[i][j]=s.nextInt();
            }}
            int sum=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(i==j){
                    sum+=arr[i][j];
                }
            }
            }
            System.out.println("Right diagonal sum is: "+sum);

    
}}