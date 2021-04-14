public class MemberInerClass {
    public static void main(String[] args) {
        O o = new O();
        O.P obj = o.new P();
        obj.show();

    }
}
class O
{
    int rollno;
    String sname;
    class P{
        public void show(){
            System.out.println("hello");
        }
    }
}
