import java.util.*;
public class greaternumber {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2){
            System.out.println("number is greater :" +num1);
        }else{
            System.out.println("number is greater : "+num2);
        }
      }
}