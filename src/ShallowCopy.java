public class ShallowCopy {
    public static void main(String[] args) {
        Cde obj = new Cde();
        obj.i = 5;
        obj.j = 6;

        Cde obj1 = obj;
        obj1.j = 8;
        System.out.println(obj1);
        System.out.println(obj);
    }
}
class Cde{

    int i;
    int j;

    @Override
    public String toString() {
        return "Cde{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}