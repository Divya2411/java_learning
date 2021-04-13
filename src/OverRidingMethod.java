

public class OverRidingMethod {

        public static void main(String[] args) {
            G obj = new G();
            obj.show();
        }
    }
    class F{
        public void show(){
            System.out.println("overriding method F");
        }

    }

class G extends F{
    public void show(){
        System.out.println("overriding method G" );
    }
}
