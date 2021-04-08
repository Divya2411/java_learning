public class ObjectCreation {
    public static void main(String[] args) {
        D obj = new D();

    }
}

class C {
    public C(){
        System.out.println("in the const C");
    }
    public C(int i){
        System.out.println("in the const int C");
    }
}
class D extends C {
    public D(){
        System.out.println("in the const D");
    }
    public D(int i){
        System.out.println("in the const int D");
    }
}
