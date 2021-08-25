import javax.swing.*;
import java.util.*;

public class Divisor {
    public static void main (String[] args) {
        int x=100000;
        int[] a= new int[x+5];
        boolean[] b= new boolean[x+5];
        for(int i=0;i<x+5;i++){
            a[i]=0;
            b[i]=false;
        }
        for(int i=2;i<x+5;i++){
            if(!b[i]){
                for(int j=i+i;j<x+5;j+=i){
                    b[j]=true;
                }}
        }
        int cnt=0;
        for(int i=2;i<=x;i++){
            if(!b[i]){cnt++;}
            a[i]=cnt;
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while(t-- > 0){
            n = sc.nextInt();
            int p = (int)Math.sqrt(n);
            System.out.println(a[p]);
        }
    }

        }

