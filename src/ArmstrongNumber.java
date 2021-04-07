public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int r;
        int sum = 0;
        int t = n;
        while (n>0 ){
            r = n%10;
            n= n/10;
            sum = sum + r*r*r;
        }
        if(t == sum){
            System.out.println("it's a Armstrong Number");
        }else{
            System.out.println("it's not a Armstrong Number");

        }
    }
}
