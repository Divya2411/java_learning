public class ToStringMethod {
    public static void main(String[] args) {
        Student1 s1 = new Student1(11, "Divya");
        System.out.println(s1);
    }
}
class Student1 {
    int rollno;
    String sname;
  public Student1(int rollno, String sname){
      this.rollno = rollno;
      this.sname = sname;

  }

    @Override
    public String toString() {
        return rollno + " : " + sname;
    }
}
