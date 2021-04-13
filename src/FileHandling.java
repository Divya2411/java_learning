import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;


public class FileHandling {
    public static void main(String[] args) throws Exception {
          File f = new File("Demo.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Divya Patel");

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}
