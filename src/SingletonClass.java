public class SingletonClass {
    public static void main(String[] args) {
        Ah obj = Ah.getInstance();
        Ah obj1 = Ah.getInstance();
    }
}

class Ah {
    public static Ah obj;
       int i;
private Ah(){
    System.out.println("instance created");
}
public static Ah getInstance(){
    if (obj == null) {
        obj = new Ah();

    }
    return obj;
}
}


