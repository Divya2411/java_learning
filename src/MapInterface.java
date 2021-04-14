import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class MapInterface {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();

        map.put("name", "Divya");
        map.put("hubby", "Nikunj");
        map.put("mom", "sumi");
        map.put("dad", "shantilal");
        System.out.println(map);
        System.out.println("-----------------------------------");
        Set<String> keys = map.keySet();
        for (String key : keys){
            System.out.println(key + " " + map.get(key));
        }



    }
}
