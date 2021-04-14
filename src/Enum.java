public class Enum {
    enum Mobile{
        APPLE(100),SAMSUNG(90), HTC;
        int price;
        Mobile(){
            price= 80;
            System.out.println("Constructor");
        }
        Mobile(int p){
            price = p;
        }
        public int getPrice(){
            return price;
        }
    }
    public static void main(String[] args) {
        System.out.println(Mobile.APPLE.getPrice());
    }
}
