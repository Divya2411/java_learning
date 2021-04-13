public class ParaConstructor {
    public static void main(String[] args) {
        Bcd obj = new Bcd(5);

    }
}
class Bcd {
    public Bcd() {
        System.out.println("Abc() is a constructor");
    }

    public Bcd(int i) {
        System.out.println("Abc() is a constructor with para");
    }
}
