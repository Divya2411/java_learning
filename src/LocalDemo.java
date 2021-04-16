import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo  {
    public static void main(String[] args) throws Exception {
        {
            String lang = "en";
            String country = "us";

            Locale l = new Locale(lang, country);
        ResourceBundle r = ResourceBundle.getBundle("Bundle", l);
            String  str = r.getString("wish");
            System.out.println(str);

        }
    }
}
