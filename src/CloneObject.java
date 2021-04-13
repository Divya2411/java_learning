public class CloneObject {
    public static void main(String[] args) throws CloneNotSupportedException {
        Xy obj = new Xy();
        obj.i = 5;
        obj.j = 6;

        Xy obj1 = (Xy)obj.clone();
    obj1.j = 8;
        System.out.println(obj1);
        System.out.println(obj);
    }
}
class Xy implements Cloneable{
    int i;
    int j;

    @Override
    public String toString() {
        return "Xy{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
