public class UserInput {
    public static void main(String[] args) throws Exception {
        //Scanner
        // Buffered Reade
        int i = System.in.read();
        System.out.print((char) i);

       String srt = "";
       while ((i = System.in.read()) != 10)
       {
           srt = srt + (char) i;
       }
        System.out.print(srt);
    }
}
