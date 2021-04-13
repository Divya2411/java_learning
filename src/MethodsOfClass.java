public class MethodsOfClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("Zx");
        System.out.println(c.isInterface());
    }
}
class Zx{

}
