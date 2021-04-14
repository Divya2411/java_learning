import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        a.add("Divya");
        a.add("nikunj");
        a.add("niku");
        a.add("nikunj");
        Set<String> s = new HashSet<>();

        for(String name : a){
            if(s.add(name)==false){
                System.out.println(name);
            }
        }


    }
}
