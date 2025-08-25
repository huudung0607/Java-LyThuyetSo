import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean check(long n){
        while(n != 0){
            long tmp = n % 10;
            if(tmp != 0 && tmp != 6 && tmp != 8){
                return false;
            }
            n/=10;
        }
        return true;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(check(n)) System.out.print(1);
        else System.out.print(0);
    }
}
