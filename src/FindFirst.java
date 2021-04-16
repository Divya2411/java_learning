import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(11,20,35,44,55,68);
        System.out.println(value.stream()
                .filter(i -> i%5==0)
                .map(i->i*2)
                .findFirst()
                .orElse(0));
    }
}
