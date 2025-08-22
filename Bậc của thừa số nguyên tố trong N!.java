import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         long n = sc.nextLong(), p = sc.nextLong();
         long ans = 0;
         for(long i = p; i <= n;  i*=p){
             ans += n/i;
         }
         System.out.print(ans);
    }
}
