import java.io.*;
import java.util.*;

public class ElementEqualtoIndex {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            if(arr[i]==i){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}