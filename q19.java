import java.util.*;
public class q19{
    public static void main(String[] args){
        int i,j;
        int[][] arr1=new int[3][3];
        int[][] arr2=new int[3][3];
        int[][] arr3=new int[3][3];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter elements in first array: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter elements in second array: ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr2[i][j]=s.nextInt();
            }
        }
        
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int[] row:arr3){
            for(int element:row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    
    }
}