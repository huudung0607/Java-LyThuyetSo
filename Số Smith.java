import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static boolean checkPrime(int n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static int sumDigit(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n/=10;
        }
        return sum;
    }
    public static boolean phanTich(int n){
        int tmp = sumDigit(n);
        int sum = 0;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                while(n % i == 0){
                    sum += sumDigit(i);
                    n/=i;
                }
            }
        }
        if(n > 1) sum += sumDigit(n);
        return sum == tmp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(!checkPrime(n) && phanTich(n)){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
