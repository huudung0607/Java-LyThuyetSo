import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean prime(int n){
        if(n < 2) return false;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static boolean csnt(int n){
        while(n != 0){
            if(n % 10 != 2 && n % 10 != 5 && n % 10 != 7 && n % 10 != 3){
                return false;
            }
            n /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b;i++){
            if(csnt(i) && prime(i)) cnt++;
        }
        System.out.print(cnt);
    }
}
