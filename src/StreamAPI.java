import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(1,2,3,4,5,6);
        System.out.println(value.stream().map(i-> i*2).reduce(0,(c,e)-> c+e));
    }
}
