public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0)
                c++;
        }
        int n=arr.length;
        for(int i=n-1,j=n-1+c;i>=0;--i,--j) {
            if(j<n)
                arr[j]=arr[i];

            if(arr[i]==0 && --j<n)
                arr[j]=0;


        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args){
        int[] arr = {1,0,2,3,0,4,5,0};
//        for (int i = 0; i < arr.length; i++)
            duplicateZeros(arr);


        duplicateZeros(arr);








    }

}
