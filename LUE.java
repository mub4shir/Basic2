import java.util.ArrayList;
import java.util.Scanner;

public class LUE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            byte n = sc.nextByte();
            if(n==42)
                return;
            else
                System.out.println(n);
        }
    }

}
