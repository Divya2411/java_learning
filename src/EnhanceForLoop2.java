import java.util.Random;



public class EnhanceForLoop2 {
    public static void main(String[]args){

    int a[]= new int[10];
    Random r = new Random();

    for(int i=0; i<10; i++){
        a[i] = r.nextInt(50);
    }for (int n : a){
            System.out.println(n);
        }
    }
}
