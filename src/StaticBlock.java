public class StaticBlock {
    static {
        System.out.println("I am static 1");
    }
    public static void main(String[] args) {
        System.out.println("I am Main");
    }
    static {
        System.out.println("I am static 2");
    }
}
