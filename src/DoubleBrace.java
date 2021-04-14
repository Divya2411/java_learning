import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleBrace {
    public static void main(String[] args) throws Exception {
        List<Integer> c = new ArrayList<>(){{

            add(10);
            add(21);
            add(1);
            add(32);
        }};


        Collections.sort(c);


        for(Object o : c){
            System.out.println(o);
        }
    }
}
