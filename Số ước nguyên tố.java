import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void phanTich(long n){
        long cnt = 0;
        for(int i = 2;i <= Math.sqrt(n);i++){
            if(n % i == 0){
                while(n % i == 0){
                    n/=i;
                }
                cnt++;
            }
        }
        if(n > 1) cnt++;
        System.out.print(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        phanTich(n);
    }
}
