import java.util.*;
public class cm19{
    public static void main(String[] args){
        int r,c,i,j;
        int[][] mat1=new int[r][c];
        int[][] mat2=new int[r][c];
        int[][] mat3=new int[r][c];
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter number of rows: ");
        r=s.nextInt();
        System.out.println("Enter number of columns: ");
        c=s.nextInt();
        System.out.println("Enter elements of matrix 1: ");
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
        mat3=mat1+mat2;
        for(int[] row:mat3){
            for(int element:row){
                    System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}