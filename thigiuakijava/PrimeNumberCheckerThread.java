package thigiuakijava;

public class PrimeNumberCheckerThread extends Thread {
    private Student student;
    private int sum;

    public PrimeNumberCheckerThread(Student student) {
        this.student = student;
    }


	@Override
    public void run() {
        String dateOfBirth = student.getDateOfBirth().toString();
        sum = 0;
        for (char c : dateOfBirth.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
    }

    public int getSum() {
        return sum;
    }

    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}

