# Student Score Logger

## About
This is a simple Java project that writes students' marks into a file using multiple threads.  
Each thread writes one student's details like name, roll number, and marks into the file.

The program also uses synchronization to make sure multiple threads do not write at the same time.

---

## Files in the Project
1. **SchoolStudents.java** - stores the student’s name, roll number, and marks.  
2. **StudentScoreWriterFile.java** - writes the student details into a file.  
3. **SchoolStudentThreads.java** - runs a thread for each student.  
4. **ScoreLoggerMain.java** - main class to start the program.  
5. **StudentScoreLoggerTest.java** - JUnit test to check if the file is created correctly.

---

## How to Run
1. Open the project in Eclipse or any Java IDE.  
2. Create a package named `scorelogger`.  
3. Add all `.java` files inside that package.  
4. Run the file **ScoreLoggerMain.java**.  
5. After running, a file named `scores.txt` will be created in the project folder with student details.

Example output in `scores.txt`:
Keerthi,IS106,99
Katherine,IS116,90
Khai,CS223,96


---

## JUnit Test
1. Open **StudentScoreLoggerTest.java**.  
2. Run it using JUnit (Right click → Run As → JUnit Test).  
3. If the file is created and not empty, the test will pass.

---

## Author
Keerthi Prabha  
Information Science and Engineering Student
