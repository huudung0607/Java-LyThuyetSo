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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(prime(n)){
            System.out.print("YES");
        }
        else System.out.print("NO");
    }
}
