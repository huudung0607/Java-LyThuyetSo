import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 1;
        for(int i = 0; i < t;i++){
            int x = sc.nextInt(), y = sc.nextInt();
            sum = 1l * sum * (y + 1) % mod;
            sum %= mod;
        }
        System.out.print(sum);
    }
}
