import java.util.ArrayList;
import java.util.Arrays;

public class Sieve {

    public static ArrayList<Integer> sieve(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2; i<=n; i++){
            if(isPrime[i]){
                for(int j = i*i; j<=n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=2; i<=n; i++){
            if(isPrime[i]) {
                list.add(i);
            }
        }
        return list;
    }
    public static int segmentedSieve(int n){
        int count = 0;
        if(n>=2){
            int limit = (int)Math.sqrt(n);
            ArrayList<Integer> primes = sieve(limit);
            count = primes.size();
            int low = limit;
            int high = 2*limit;
            while(low < n){
                if(high >= n)
                    high = n;
                boolean [] mark = new boolean[limit + 1];
                Arrays.fill(mark, true);
                for(int i=0; i<primes.size(); i++){
                    int smallest = low/primes.get(i) * primes.get(i);
                    if(smallest <low)
                        smallest = smallest + primes.get(i);
                    for(int j= smallest; j <= high; j = j + primes.get(i)){
                        mark[j-low] = false;
                    }
                }
                for(int i = low; i<=high; i++){
                    if(mark[i-low]){
                        count++;
                    }
                }
                low = low + limit;
                high = high + limit;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(segmentedSieve(100));
    }

}
