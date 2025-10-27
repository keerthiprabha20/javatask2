package scorelogger;

import java.io.*;

public class StudentScoreWriterFile {
    FileOutputStream file;

    StudentScoreWriterFile(String fname) {
        try {
            file = new FileOutputStream(fname, true);
        } catch (Exception e) {
            System.out.println("error opening file");
        }
    }

    synchronized void writeMarks(SchoolStudents s) {
        try {
            String line = s.makeLine() + "\n";
            byte b[] = line.getBytes();
            file.write(b);
        } catch (Exception e) {
            System.out.println("writing error");
        }
    }

    void closeFile() {
        try {
            file.close();
        } catch (Exception e) {
            System.out.println("error closing file");
        }
    }
}
