import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b= sc.nextLong();
        int dem = 0;
        long s = (long)Math.ceil(Math.sqrt(a));
        long t = (long)Math.sqrt(b);
        for(long i = s;i <= t;i++){
            dem++;
        }
        System.out.print(dem);
    }
}
