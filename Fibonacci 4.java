import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean check(int n){
        long []F = new long[100];
        F[0] = 0; F[1] = 1;
        for(int i = 2;i <= 92;i++){
            F[i] = F[i - 1] + F[i - 2];
        }
        for(int i = 1; i <= 92;i++){
            if(sumCheck(n) == F[i]) return true;
        }
        return false;
    }
    public static boolean primeCheck(int n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static int sumCheck(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n/=10;
        }
        return sum;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2;i <= n ;i++){
            if(primeCheck(i) && check(i)){
                System.out.print(i + " ");
            }
        }
    }
}
