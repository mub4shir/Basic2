import java.lang.Math;

class As {
//    static int ArmstrongCount(int n){
//        int count = 0;
//        for(int i = 0; i <= n; i++){
//            int num = i, rem, digit = 0, sum = 0;
//            num = i;
//            int digit = (int) Math.log10(num) + 1;

//            while(num > 0){
//                rem = num % 10;
//                sum = sum + (int)Math.pow(rem, digit);
//                num = num / 10;
//            }
//            if(i == sum)
//                count++;
////            if(count == n)
////                return i;
//        }
//        return count;
//    }

    public static void main(String[] args){
        int n = 1000;
        int digit = (int) Math.log10(n) + 1;
        System.out.print(digit);
//        System.out.println(ArmstrongCount(n));
    }
}