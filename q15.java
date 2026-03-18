import java.util.*;
public class q15{
    public static void main(String[] args){
        int[] arr1= new int[5];
        int[] arr2 = new int[5];
        int i,j;
        Scanner s=new Scanner(System.in);
        System.out.println("enter elements in array 1: ");
        for(i=0;i<5;i++){
            arr1[i]=s.nextInt();
        }
        System.out.println("enter elements in array 2: ");
        for(i=0;i<5;i++){
            arr2[i]=s.nextInt();
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println("Common elemnet found! "+arr2[j]);
                }
            }
        }
    }
}