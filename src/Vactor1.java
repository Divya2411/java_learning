import java.util.Vector;

public class Vactor1 {
    public static void main(String[] args) throws Exception{
        Vector<Integer> v = new Vector<>();
        
        v.add(2);
        v.add(22);
        v.add(32);
        v.add(44);
        v.add(25);
        v.add(21);


        for (int i : v){
            System.out.println(i);
        }
    }


}
