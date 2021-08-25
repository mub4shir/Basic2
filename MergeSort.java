
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MergeSort {
    static void merge(int a[], int l, int m , int h){

        int n1=m-l+1;
        int n2=h-m;
        int left[]= new int[n1];
        int right[]= new int[n2];
        for(int i=0;i<n1;++i){
            left[i]=a[l+i];
        }
        for(int j=0;j<n2;++j){
            right[j]=a[j+m+1];
        }
        int i=0,j=0,k=l;
        while(i<n1&&j<n2){
            if(left[i]>=right[j])
            {a[k]=left[i];
                k++;
                i++;}
            else
            {a[k]=right[j];
                k++;
                j++;}
        }
        while(i<n1){
            a[k]=left[i];
            k++;
            i++;
        }
        while(j<n2){
            a[k]=right[j];
            k++;
            j++;
        }


    }
    static void mergesort(int a[], int start, int end){
        if(start<end){
            int m=start+(end-start)/2;
            mergesort(a,start,m);
            mergesort(a,m+1,end);
            merge(a,start,m,end);
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int [n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        //int m=n/2;
        mergesort(a,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }


    }}