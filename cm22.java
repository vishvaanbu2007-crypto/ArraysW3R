import java.util.*;
public class cm22{
    public static void main(String[] args){
        int r,c,i,j;
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        r=s.nextInt();
        System.out.println("Enter number of columns: ");
        c=s.nextInt();
        System.out.println("Enter elements of matrix 1: ");
        int[][] mat1=new int[r][c];
        
        int[][] mat3=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat1[i][j]=s.nextInt();
            }
        }
         System.out.println("original matrix: ");
       for(int[] row:mat1){
            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
        int k;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
               mat3[i][j]=mat1[j][i];
               
                
            }
        }
        System.out.println("transposed matrix: ");
        for(int[] row:mat3){
            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}