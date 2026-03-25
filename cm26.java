import java.util.*;
class cm26{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter number of row: ");
        r=s.nextInt();
        System.out.println("Enter number of columns: ");
        c=s.nextInt();

        int[][] mat = new int[r][c];
        
        System.out.println("Enter elements in matrix: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat[i][j]=s.nextInt();
            }
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                if(i>j){
                    mat[i][j]=0;
                }
            }
        }
        for(int[] row:mat){
            for(int element :row){
                System.out.print(element+" ");
            }
            System.out.println(" ");
        }


    }}