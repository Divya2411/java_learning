import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterface {
    public static void main(String[] args) throws Exception {
        List<Integer> c = new ArrayList<>();

        c.add(10);

        c.add(21);
        c.add(15);
        c.add(32);
      Comparator<Integer> com = (o1,o2) -> o1%10>o2%10?1:-1;

        Collections.sort(c,com);


        for(int o : c){
            System.out.println(o);
        }
    }
}
