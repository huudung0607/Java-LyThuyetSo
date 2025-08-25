import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static int []prime = new int[10000007];
    public static void seive(){
        for(int i = 0;i < 10000007;i++){
            prime[i] = 1;
        }
        prime[0] = prime[1] = 0;
        for(int i = 2;i <= Math.sqrt(10000007);i++){
            if(prime[i] == 1){
                for(int j = i * i;j < 10000007;j+=i){
                    prime[j] = 0;
                }
            }
        }
    }
    public static boolean increase(int n){
        int lastNum = n % 10;
        n/=10;
        while(n != 0){
            int nextNum = n % 10;
            if(lastNum < nextNum){
                return false;
            }
            //lastNum = nextNum;
            n/=10;
        }
        return true;
    }
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        seive();
        int cnt = 0;
        for(int i = 2;i <= n;i++){
            if(prime[i] == 1 && increase(i)){
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.print("\n" + cnt);
    }
}
