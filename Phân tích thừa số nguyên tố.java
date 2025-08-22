import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         long n = sc.nextLong();
         for(int i = 2;i <= Math.sqrt(n);i++){
             if(n % i == 0){
                 int cnt = 0;
                 while(n % i == 0){
                     n/=i;
                     cnt++;
                 }
                 System.out.print(i + "^" + cnt);
                 if(n > 1) System.out.print(" * ");
             }
         }
         if(n > 1) System.out.print(n + "^" + 1);
    }
}
