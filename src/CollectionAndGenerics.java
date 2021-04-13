import java.util.ArrayList;
import java.util.Collection;

public class CollectionAndGenerics {
    public static void main(String[] args) throws Exception {
         Collection c = new ArrayList();

         c.add(1);
        c.add("Divya");
        c.add("Patel");
        c.add(111);

         for(Object o : c){
             System.out.println(o);
         }
    }
}
