import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long tmp = (long)Math.sqrt(n);
        if(tmp * tmp == n) System.out.print("YES");
        else System.out.print("NO");
    }
}
