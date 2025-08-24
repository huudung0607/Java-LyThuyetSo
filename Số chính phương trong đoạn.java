import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b= sc.nextLong();
        for(long i = (long)Math.ceil(Math.sqrt(a));i <= Math.sqrt(b);i++){
            System.out.print((long)Math.pow(i,2) + " ");
        }
    }
}
