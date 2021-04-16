import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(1,2,3,4,5,6);
        value.forEach(i -> System.out.println(i));
    }
}
