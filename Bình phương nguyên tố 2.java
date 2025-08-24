import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static boolean check(int n){
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                int cnt = 0;
                while(n % i == 0){
                    cnt++;
                    n/=i;
                }
                if(cnt < 2) return false;
            }
        }
        if(n > 1) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        for(int i = a;i <= b;i++){
            if(check(i)){
                System.out.print(i + " ");
            }
        }
    }
}
