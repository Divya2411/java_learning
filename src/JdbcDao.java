import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class JdbcDao {
    public static void main(String[] args) throws Exception {
        StudentDAO dao = new StudentDAO();
        Student s1 = dao.getStudent(4);
        System.out.println(s1.sname);
    }
}
class StudentDAO{
    public Student getStudent(int rollno){
        try{
            String query = "select sname from student where rollno=" + rollno ;
            Student s = new Student();
            s.rollno = rollno;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school","root", "Nikdiv@123");
           Statement st =con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getString(1);
            s.sname = name;
            return s;

        } catch (Exception e) {
            System.out.println(e);
        }return null;
    }
}


class Student {
    int rollno;
    String sname;
}
