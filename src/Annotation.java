public class Annotation {
    public static void main(String[] args) {
    NokiaASeries obj = new NokiaASeries("fire", 5);
        System.out.println(obj.model);
        
    }

}
@interface SmartPhone{
    String os() default "Symbian";
    int version() default 1;
}

@SmartPhone(os = "Android", version = 6)
class NokiaASeries{
    String model;
    int size;

    public NokiaASeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}
