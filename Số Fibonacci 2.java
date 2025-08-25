import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean check(long n){
        if(n == 0 || n == 1) return true;
        long []F = new long[100];
        F[0] = 0; F[1] = 1;
        for(int i = 2;i <= 92;i++){
            F[i] = F[i - 1] + F[i - 2];
        }
        for(int i = 2; i <= 92;i++){
            if(n == F[i]) return true;
        }
        return false;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(check(n)) System.out.print("YES");
        else System.out.print("NO");
    }
}
