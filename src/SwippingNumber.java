public class SwippingNumber {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
//        int c ;

//        c = a;
//        a= b;
//        b = c;
        a = a +b;
        b = a -b;
        a= a-b;

        // b = a+b -(a=b);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
