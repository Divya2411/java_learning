import java.sql.*;
public class JDBC1 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/school";
        String uname = "root";
        String pass = "Nikdiv@123";
        int rollno = 5;
        String sname = "pinky";
        String query = "insert into student values (?,?)";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,uname,pass);
        PreparedStatement st = con.prepareStatement(query);
         st.setInt(1,rollno);
         st.setString(2,sname);
        int count = st.executeUpdate();



        System.out.println(count + " row affected");
        st.close();
        con.close();
    }

}
