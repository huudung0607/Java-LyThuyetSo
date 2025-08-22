import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         long n = sc.nextLong();
         long ans = 0;
         long p = 5;
         while(n/p > 0){
             ans += n/p;
             ans %= mod;
             p *= 5;
         }
         System.out.print(ans);
    }
}
