import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    static long isConsecutive(String str)
    {

        long start;


        int length = str.length();
        if(length==1)
            return -1;
        for (int i = 0; i < length / 2; i++)
        {
            String new_str = str.substring(0, i + 1);
            long num = Long.parseLong(new_str);
            start = num;
            while (new_str.length() < length)
            {
                num++;


                new_str = new_str + num;
            }


            if (new_str.equals(str))
                return start;
        }
        return -1;
    }

    public static void main (String[] args) {
        // Your code here
        Scanner in =new Scanner(System.in);
        String s=in.next();
        long ans= isConsecutive(s);
        if(ans==-1)
            System.out.print("NO");
        else{
            System.out.println("YES "+ans);

        }
    }
}