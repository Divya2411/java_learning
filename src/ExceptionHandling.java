public class ExceptionHandling {
    public static void main(String[] args) {
        int i, j, k=0;
        i = 9;
        j=0;
        try {
            k = i/j;
        }catch (Exception e){
            System.out.println("can not divide any  value with 0");
        }
    }
}
