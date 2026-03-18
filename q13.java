import java.util.*;
public class q13{
    public static void main(String[] args){
  String[] arr=new String[5];
  int i,j;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter Strings: ");
  for(i=0;i<5;i++){
    arr[i]=s.next();
}
  boolean[] visited=new boolean[5];
  for(i=0;i<5;i++){
    if(visited[i]) continue;
    boolean Duplicatefound=false;
    for(j=i+1;j<5;j++){
        if(arr[i].equals(arr[j])){
            visited[j]=true;
            Duplicatefound=true;
            System.out.println("Duplicate found! "+arr[j]);
        }

    }
  }
    }
}