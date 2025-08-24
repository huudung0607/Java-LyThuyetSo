import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        long n = sc.nextLong();
        for(int i = 1; i <= Math.sqrt(n);i++){
            if(n % i == 0){
                sum += i;
                if(i != n/i){
                    sum += n/i;
                }
            }
        }
        System.out.print(sum);
    }
}
