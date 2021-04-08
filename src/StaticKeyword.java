public class StaticKeyword {
    public static void main(String[] args) {
        Divya.show();
    }
}
class Divya{
    static int i = 5;
    public static void show(){
        System.out.println("hello");
        System.out.println(i);
    }
}
