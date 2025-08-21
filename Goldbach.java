import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static int []prime = new int[1000006];
    public static void seive(){
        for(int i = 0; i < 1000006;i++){
            prime[i] = 1;
        }
        prime[1] = prime[0] = 0;
        for(int i = 2; i < Math.sqrt(1000006);i++){
            if(prime[i] == 1){
                for(int j = i * i;j < 1000006 ;j += i){
                    prime[j] = 0;
                }
            }
        }
    }
    //duyệt tới n/2 vì để không bị trùng. vd i = 3 -> n - i = 7, xong i = 7 thì n - i =  3 thì trùng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        seive();
        for(int j = 1;j <= t;j++){
            int n = sc.nextInt();
            for(int i = 1;i <= n/2;i++){
                if(prime[i] == 1 && prime[n - i] == 1){
                    System.out.println(i + " " + (n - i));
                }
            }
        }
    }
}
