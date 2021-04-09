public class AbstractClass {
    public static void main(String[] args) {
        SureshPhone obj = new RameshPhone();
        obj.call();
        obj.move();
        obj.dance();
        obj.heat();
    }
}
abstract class MaheshPhone{
    public void call(){
        System.out.println("calling...");
    }
    abstract public void move();
    abstract public void dance();
    abstract public void heat();

}
abstract class SureshPhone extends MaheshPhone{
    public void move() {
        System.out.println("moving....");
    }
}

class RameshPhone extends SureshPhone{
    public void dance() {
        System.out.println("Dancing....");
    }
    public void heat() {
        System.out.println("heating....");
    }
}


