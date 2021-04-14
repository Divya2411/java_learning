import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomCollections {
    public static void main(String[] args) {
        List<Students> studs = new ArrayList<>();
        studs.add(new Students(1,55));
        studs.add(new Students(2,45));
        studs.add(new Students(3,85));
        studs.add(new Students(4,95));
        studs.add(new Students(5,75));
        Collections.sort(studs, (s1, s2) -> s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0
        );
        for(Students s : studs){
            System.out.println(s);
        }

    }
}

class Students {
    int rollno;
    int marks;
    public Students(int rollno, int marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
