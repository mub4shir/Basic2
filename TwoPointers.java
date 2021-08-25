public class TwoPointers {
        public static void main(String[] args) {
            int[] arr= {2,3,1,-1,0,7,6};
            int n=arr.length;
            int i = n - 1;
            int j = 0;
            while(i > j)
            {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
                arr[i] = arr[i]+arr[j];
                arr[j] = arr[i]-arr[j];
                arr[i] = arr[i]-arr[j];
                i--;
                j++;
            }
            for(i = 0; i < n; i++)
                System.out.print(arr[i]+ " ");
            }

        }

