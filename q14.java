import java.util.*;
public class q14{
    public static void main(String[] args){
        String[] arr1=new String[5];
        String[] arr2=new String[5];
        Scanner s=new Scanner(System.in);
        int i,j;
        System.out.println("Enter elements in first array: ");
        for(i=0;i<5;i++){
            arr1[i]=s.next();
        }
        System.out.println("Enter elements in second array: ");
        for(i=0;i<5;i++){
            arr2[i]=s.next();
        }
        
        for(i=0;i<5;i++){
            
            
           for(j=0;j<5;j++){
            if(arr1[i].equals(arr2[j])){
                
                System.out.println("common element found! "+arr2[j]);
            }
           }
        }
    }
}