package thigiuakijava;

import java.time.LocalDate;
import java.time.Period;
import java.util.Base64;

public class AgeCalculatorThread1 extends Thread {
    private Student student;
    private int age;
    private String encodedAge;

    public AgeCalculatorThread1(Student student) {
        this.student = student;
    }

    public void AgeCalculatorThread(Student student2) {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void run() {
        LocalDate today = LocalDate.now();
        LocalDate birthday = student.getDateOfBirth();
        Period period = Period.between(birthday, today);
        age = period.getYears();
        encodedAge = Base64.getEncoder().encodeToString(String.valueOf(age).getBytes());
    }

    public int getAge() {
        return age;
    }

    public String getEncodedAge() {
        return encodedAge;
    }
}
