import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInerface {
    public static void main(String[] args) throws Exception {
        List<Integer> c = new ArrayList<>();

        c.add(10);

        c.add(21);
        c.add(1);
        c.add(32);

       Collections.sort(c);


        for(Object o : c){
            System.out.println(o);
        }
    }
}
