import java.util.*;
public class q3{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String[][] a=new String[10][10];
        int i,j;
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                a[i][j]= "-";
            }
        }
        for(i=0;i<10;i++){
            for(j=0;j<10;j++){
                
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}