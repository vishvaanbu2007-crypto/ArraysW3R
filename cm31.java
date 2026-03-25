import java.util.*;
class cm31{    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
        int r,c,i,j;
        System.out.println("Enter number of row: ");
        r=s.nextInt();
        System.out.println("Enter number of columns: ");
        c=s.nextInt();

        int[][] mat = new int[r][c];
        
        
        System.out.println("Enter elements in matrix : ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                mat[i][j]=s.nextInt();
        }}
        for{
            for(j=0;j<c;j++){
                if(mat[i][i]==1){
                    if(i>j){
                        if(mat[i][j]==0){
                            if(j<i){
                                if(mat[i][j]==0){
                                    System.out.println("Identity matrix");

                                }
                            }
                        }
                    }
                }
            }}
        
}}