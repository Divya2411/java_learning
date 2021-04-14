public class NestedInnerClass {
    public static void main(String[] args) throws Exception {
       // Cp c = new Cp();
        Cp.Pc obj = new Cp.Pc();
        obj.show();

    }
}
class Cp
{
    int rollno;
    String sname;
    static class Pc{
        public void show(){
            System.out.println("hello");
        }
    }
}

