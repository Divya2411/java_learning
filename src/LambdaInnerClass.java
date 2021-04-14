public class LambdaInnerClass {
    public static void main(String[] args) {
        W obj = () -> System.out.println("hello");
        obj.show();
    }
}
interface W{
    void show();
}
