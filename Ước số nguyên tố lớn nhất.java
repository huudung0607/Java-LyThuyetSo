import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean prime(long n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t;i++){
            long n = sc.nextLong();
            if(prime(n)){
                System.out.println(n);
            }
            else {
                for(int j = 2;j <= Math.sqrt(n);j++){
                    if(n % j == 0){
                        while(n % j == 0){
                            n/=j;
                        }
                        if(n == 1) {
                            System.out.println(j);
                            break;
                        }
                    }
                }
                if(n > 1) System.out.println(n);
            }
        }
    }
}
