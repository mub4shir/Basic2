import java.util.Scanner;

class NumberOfSubSequences  {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        final long mod=(long)1e9 + 7;
        String s=sc.nextLine();
        long ans=1, c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')
                c++;
            if(s.charAt(i)=='b') {
                ans = (ans*(c+1)) % mod;
                c = 0;
            }
        }
        ans=(ans*(c+1))%mod;
        System.out.print((ans-1+mod)%mod);
    }
}