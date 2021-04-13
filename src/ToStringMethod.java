public class ToStringMethod {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Divya");
        System.out.println(s1);
    }
}
class Student {
    int rollno;
    String sname;
  public Student(int rollno, String sname){
      this.rollno = rollno;
      this.sname = sname;

  }

    @Override
    public String toString() {
        return rollno + " : " + sname;
    }
}
