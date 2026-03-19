import java.util.*;
public class cm18{
    public static void main(String[] args){
int ro,columns,i,j;
Scanner s=new Scanner(System.in);
System.out.println("enter numbe of row: ");
ro=s.nextInt();
System.out.println("Enter number of columns: ");
columns=s.nextInt();


int[][] mat= new int[ro][columns];
System.out.println("Enter elements: ");
for(i=0;i<ro;i++){
    for(j=0;j<columns;j++){
        mat[i][j]=s.nextInt();

    }
}
for(int[] row : mat){
    for(int element:row){
        System.out.print(element+" ");
    }
    System.out.println();
}
    }
}