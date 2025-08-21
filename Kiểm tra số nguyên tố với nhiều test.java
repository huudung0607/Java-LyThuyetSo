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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0 ;i < t;i++){
            int n = sc.nextInt();
            if(prime(n)){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
