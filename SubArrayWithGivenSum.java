import java.util.*;
import java.lang.*;
import java.io.*;
public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long s = sc.nextLong();

            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }

            Compute obj = new Compute();
            ArrayList<Integer> res = obj.subarraySum(arr, n, s);
            for (int k = 0; k < res.size(); k++)
                System.out.print(res.get(k) + " ");
            System.out.println();



    }

}
class Compute{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, long s)
    {
        int start = 0;
        int last = 0;
        boolean flag=false;
        long currsum=0;
        ArrayList<Integer> res = new ArrayList<Integer>();

        //iterating over the array.
        for(int i=0;i<n;i++)
        {
            //storing sum upto current element.
            currsum+= arr[i];

            //checking if current sum is greater than or equal to given number.
            if(currsum>=s)
            {
                last=i;
                //we start from starting index till current index and do the
                //excluding part while s(given number) < currsum.
                while(s<currsum && start<last)
                {
                    //subtracting the element from left i.e., arr[start]
                    currsum-= arr[start];
                    ++start;
                }

                //now if current sum becomes equal to given number, we store
                //the starting and ending index for the subarray.
                if(currsum==s)
                {
                    res.add(start + 1);
                    res.add(last + 1);

                    //flag is set to true since subarray exists.
                    flag = true;
                    break;
                }
            }
        }
        //if no subarray is found, we store -1 in result else the found indexes.
        if (flag==false) {
            res.add(-1);
        }
        //returning the result.
        return res;
    }
}

