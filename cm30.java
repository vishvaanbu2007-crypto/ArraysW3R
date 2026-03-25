import java.util.*;
class cm30{    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter number of row: ");
        r=s.nextInt();
        System.out.println("Enter number of columns: ");
        c=s.nextInt();

        int[][] mat1 = new int[r][c];
        int[][] mat2 = new int[r][c];
        
        System.out.println("Enter elements in matrix 1: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat1[i][j]=s.nextInt();
        }}
        System.out.println("Enter elements in matrix 2: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat2[i][j]=s.nextInt();
        }}
        System.out.println("Matrix check: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(mat1[i][j]==mat2[i][j]){
                    System.out.println("Matrix element equal: ");
                }


    }}}}

