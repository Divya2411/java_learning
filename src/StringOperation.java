import java.util.Scanner;

public class StringOperation {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 strings ...");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        int l1 = s1.length();
        int l2 = s2.length();
        String u1 = s1.toUpperCase();
        System.out.println("length of string 1 is " + l1 + " length of string 2 is " + l2);
        String s3 = u1.concat(s2);
        System.out.println("result of concat is : " + s3);
    }
}
