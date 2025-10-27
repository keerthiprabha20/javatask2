package scorelogger;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

public class StudentScoreLoggerTest {

    @Test
    public void testFileCreated() {
        try {
        	StudentScoreWriterFile mw = new StudentScoreWriterFile("test_scores.txt");

        	SchoolStudents s1 = new SchoolStudents("Keerthi", "IS106", 99);
        	SchoolStudentThreads t1 = new SchoolStudentThreads(s1, mw);

            t1.start();
            t1.join();

            mw.closeFile();

            File f = new File("test_scores.txt");
            assertTrue("File not created or empty", f.exists() && f.length() > 0);

        } catch (Exception e) {
            fail("Exception came: " + e.getMessage());
        }
    }
}
