import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         long n = sc.nextLong();
         int dem = 0;
         for(int i = 2;i <= Math.sqrt(n);i++){
             if(n % i == 0){
                 int cnt = 0;
                 while(n % i == 0) {
                     cnt++;
                     n /= i;
                     if (cnt > 1) {
                         System.out.print(0);
                         return;
                     }
                 }
                 if(cnt == 1) dem++;
             }
         }
         if(n > 1) dem++;
         if(dem == 3) System.out.print(1);
         else System.out.print(0);
    }
}
