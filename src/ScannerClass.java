import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("enter number between 1 and 10");
        i = sc.nextInt();
        switch (i){
            case 1:
                System.out.println("you are so kind");
                break;

            case 2:
                System.out.println("you are so Lucky");
                break;
            case 3:
                System.out.println("you are so Pretty");
                break;
            case 4:
                System.out.println("you are so loving");
                break;
            case 5:
                System.out.println("you have smiling face ");
                break;
            case 6:
                System.out.println("you respect others");
                break;
            case 7:
                System.out.println("Your each day is special for you");
                break;
            case 8:
                System.out.println("you are so shy");
                break;
            case 9:
                System.out.println("your eyes say everything");
                break;
            case 10:
                System.out.println("you love to talk");
                break;
            default:
                System.out.println("Please Enter valid Number");
        }
    }
}
