public class test {
    public static void main(String[] args) {
        int a=12;
        int b=15;
        int c=4;
        int res = (a-b)%c;
        int ress = ((a%c)-(b%c))%c;
        System.out.print("res: "+ res +"\t");
        System.out.print("ress " +ress);
    }
}
