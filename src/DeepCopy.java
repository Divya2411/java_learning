public class DeepCopy {

        public static void main(String[] args) {
            Cd obj = new Cd();
            obj.i = 5;
            obj.j = 6;

            Cd obj1 = new Cd();
            obj1.i = obj.i;
            obj1.j = obj.j;
            obj1.j = 8;
                    System.out.println(obj1);
            System.out.println(obj);
        }
    }
    class Cd{

        int i;
        int j;

        @Override
        public String toString() {
            return "Cd{" +
                    "i=" + i +
                    ", j=" + j +
                    '}';
        }
    }

