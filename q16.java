import java.util.*;
public class q16{
    public static void main(String[] args){
        int[] arr=new int[5];
        int i,j,size=5;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter elements: ");
        for(i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int dupli=0;
        for(i=0;i<size;i++){
            for(j=i+1;j<size;j++){
                if(arr[i]==arr[j]){
                    
                    for(int k=j;k<4;k++){
                        arr[k]=arr[k+1];
                    }
                    size--;
                    j--;
                }
            }
        }
        for(i=0;i<size;i++){
            System.out.println("New Array: "+arr[i]);
        }
    }
}