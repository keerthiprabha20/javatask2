package scorelogger;

public class SchoolStudents {
    String name;
    String rollno;
    int marks;

    SchoolStudents(String n, String r, int m) {
        name = n;
        rollno = r;
        marks = m;
    }

    String makeLine() {
        return name + "," + rollno + "," + marks;
    }
}
