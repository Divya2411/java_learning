public class AnonymousClass {
    public static void main(String[] args) throws Exception {

        Phone obj = new Phone(){
            public void show() {
                System.out.println("hii");
            }
        };
        obj.show();

    }
}
class Phone {
    public void show() {
        System.out.println("hello");
    }
}

