import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowAndThrows {
    public static void main(String[] args) throws Exception {
        int i, j, k;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i= 8;

        try {
            System.out.println("enter a number");
            j = Integer.parseInt(br.readLine());
            k = i + j;
            if (k < 10) {
                throw new ArithmeticException();
            }
            System.out.println("output is : " + k);

        }
        catch (Exception e){
            System.out.println("Unknown Exception");
        }
        finally {
            System.out.println("finally bye");
        }
    }
}
