public class PerfectNumber {
    public static void main(String[] args) {
        int n = 20;
        boolean b = isPerfect(n);
        if(b){
            System.out.println("is perfect number");
        }else{
            System.out.println("is not perfect number");
        }
    }
    public static boolean isPerfect(int n){
        int sum = 0;
        for(int i = 1; i<n; i++){
            if(n%i==0){
                sum = sum+i;
            }
        }if(n==sum){
            return true;}
        else{
                return false;
            }

        }
    }

