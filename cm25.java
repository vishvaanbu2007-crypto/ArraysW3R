import java.util.*;
class cm25{
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
        
        System.out.println("Sum row-wise is: ");
        for(i=0;i<r;i++){int k=i;
        int rsum=0;
            for(j=0;j<c;j++){
                rsum+=mat[k][j];
                
            }
            System.out.println("Sum of row "+(k+1)+" is: "+rsum);
        }
        System.out.println("Sum column-wise is: ");
        for(i=0;i<r;i++){int k=i;
        int csum=0;
            for(j=0;j<c;j++){
                csum+=mat[j][k];
                
            }
            System.out.println("Sum of column "+(k+1)+" is: "+csum);
        }
        

    }
}