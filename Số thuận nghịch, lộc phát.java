import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static boolean check(int n){
        while(n != 0){
            int tmp = n % 10;
            if(tmp == 6){
                return true;
            }
            n/=10;
        }
        return false;
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
    public static boolean sumCheck(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n/=10;
        }
        return (sum % 10) == 8;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b =sc.nextInt();
        for(int i = a;i <= b;i++){
            if(thuanNghich(i) && check(i) && sumCheck(i)){
                System.out.print(i + " ");
            }
        }
    }
}
