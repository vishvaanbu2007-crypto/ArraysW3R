import java.util.*;
public class q12{
    public static void main(String[] args){
 int[] arr=new int[5];
 Scanner s = new Scanner(System.in);
 int i,j;
 System.out.println("Enter integers in array: ");
 for(i=0;i<5;i++){
    arr[i]=s.nextInt();
 }
 boolean[] visited=new boolean[5];
 for(i=0;i<5;i++){
    if(visited[i]) continue;
    boolean Duplicatefound=false;
    for(j=i+1;j<5;j++){
        if(arr[i]==arr[j]){
            visited[j]=true;
            Duplicatefound=true;
            System.out.println("Duplicate found!"+arr[j]);
        }
    }
 }
    
    }

}