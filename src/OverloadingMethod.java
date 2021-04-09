public class OverloadingMethod {
    public static void main(String[] args) {
        E obj = new E();
        obj.show(4);
    }
}
class E{
    public void show(){
        System.out.println("overloading method");
    }
    public void show(int i){
        System.out.println("overloading method " + i);
    }
}
