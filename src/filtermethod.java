import java.util.Arrays;
import java.util.List;

public class filtermethod {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(11,20,35,44,55,68);
        System.out.println(value.stream().filter(i -> i%5==0).reduce(0, (c,e) -> c+e));
    }
}
