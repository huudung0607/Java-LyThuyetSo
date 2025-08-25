import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean check(int n) {
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                cnt++;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1) cnt++;
        return cnt >= 3;
    }
    public static boolean thuanNghich(int n){
        int tmp = n;
        int sum = 0;
        while(n != 0){
            sum = sum * 10 + n % 10;
            n/=10;
        }
        return sum == tmp;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        boolean flag = false;
        for(int i = a; i <= b; i++){
            if(thuanNghich(i) && check(i)){
                System.out.print(i + " ");
                flag = true;
            }
        }
        if(!flag) System.out.print(-1);
    }
}
