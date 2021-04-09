public class MarkerInterface {
    public static void main(String[] args) {
        M obj = new M();
        if( obj instanceof N){
            obj.show();
        }else {
            System.out.println("not permitted ");
        }
    }
}
interface N{

}
class M implements N{
    public void show(){
        System.out.println("hello there");
    }
}
