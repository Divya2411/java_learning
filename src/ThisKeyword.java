public class ThisKeyword {
    public static void main(String[] args) {
        J obj = new J(6);
        obj.show();
    }
}
class J{
    private int x;
    public J(int x){
        this.x = x;
    }
    public void show(){
        System.out.println("x is " + x);
    }
}
