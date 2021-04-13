public class SuperKeyword {
    public static void main(String[] args) {
        I obj = new I();
        obj.show();
    }
}
class H{
    public void show(){
        System.out.println("super keyword H");
    }

}

class I extends H {
    public void show() {
        super.show();
        System.out.println("super keyword I");
    }
}

