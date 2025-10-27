package scorelogger;

public class SchoolStudentThreads extends Thread {
    SchoolStudents stud;
    StudentScoreWriterFile markswriter;

    SchoolStudentThreads(SchoolStudents s, StudentScoreWriterFile w) {
        stud = s;
        markswriter = w;
    }

    public void run() {
        markswriter.writeMarks(stud);
    }
}
