public class Interface {
    public static void main(String[] args) {
        Xyz obj = new Xyz();
        obj.show();
        obj.display();
    }
}
interface K {
    public void show();
}
interface L {
    public void display();
}
class Xyz implements K,L{
    public void show(){
        System.out.println("hello");
    }
    public void display(){
        System.out.println("display...");
    }
}