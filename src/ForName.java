public class ForName {


    public static void main(String[] args) throws Exception{
        Class.forName("Pqr").newInstance();


    }
}
class Pqr{
    static {
        System.out.println("static");
    }
    {
        System.out.println("instance");
    }
}
