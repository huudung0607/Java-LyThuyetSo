import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean check(long n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static boolean perfectNum(long n){
        for(int i = 1; i <= 32;i++){
            if(check(i)){
                long tmp = (long)Math.pow(2,i) - 1;
                if(check(tmp)){
                    long tmp2 = (long)Math.pow(2,i -1);
                    if(tmp * tmp2 == n){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(perfectNum(n)){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
