import java.io.*;
import java.util.*;

public class checkchar {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++){
            if(arr[i]>0){
                arr[i]=1;
            }
             else if(arr[i]<0){
                 arr[i]=-1;
             }
             else if(arr[i]==0){
                 arr[i]=0;
             }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");;
        }
    }
}