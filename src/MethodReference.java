import java.util.Arrays;
import java.util.List;

public class MethodReference {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(1,2,3,4,5,6);
        value.forEach(System.out::println);
    }
}
