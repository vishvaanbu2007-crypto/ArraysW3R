import java.util.*;
public class cm21{
    public static void main(String[] args){
        int r,c,i,j;
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        r=s.nextInt();
        System.out.println("Enter number of columns: ");
        c=s.nextInt();
        System.out.println("Enter elements of matrix 1: ");
        int[][] mat1=new int[r][c];
        int[][] mat2=new int[r][c];
        int[][] mat3=new int[r][c];
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat1[i][j]=s.nextInt();
            }
        }
        System.out.println("Enter elements of matrix 2: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat2[i][j]=s.nextInt();
            }
        }
        int k;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
               int sum=0;
               for(k=0;k<c;k++){
                sum+=mat1[i][k]*mat2[k][j];

               }
               mat3[i][j]=sum;
                
            }
        }
        for(int[] row:mat3){
            for(int element : row){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}