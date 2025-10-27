package scorelogger;

public class ScoreLoggerMain {
    public static void main(String[] args) {
        try {
        	StudentScoreWriterFile mw = new  StudentScoreWriterFile("scores.txt");

            SchoolStudents s1 = new SchoolStudents("Keerthi", "IS106", 99);
            SchoolStudents s2 = new SchoolStudents("Katherine", "IS116", 90);
            SchoolStudents s3 = new SchoolStudents("Khai", "CS223", 96);

            SchoolStudentThreads t1 = new  SchoolStudentThreads (s1, mw);
            SchoolStudentThreads t2 = new  SchoolStudentThreads (s2, mw);
            SchoolStudentThreads t3 = new  SchoolStudentThreads (s3, mw);

            t1.start();
            t2.start();
            t3.start();

            t1.join();
            t2.join();
            t3.join();

            mw.closeFile();

            System.out.println("done writing marks!");
        } catch (Exception e) {
            System.out.println("error happened");
        }
    }
}
