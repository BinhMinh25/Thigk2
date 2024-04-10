package thigiuakijava;

import java.io.File;

public class main {
    public static void main(String[] args) {
        File studentFile = new File("student.xml");
        FileReaderThread readerThread = new FileReaderThread(studentFile);
        readerThread.start();

        try {
            readerThread.join();
            Student student = readerThread.getStudent();

            AgeCalculatorThread1 ageThread = new AgeCalculatorThread1(student);
            ageThread.start();

            PrimeNumberCheckerThread primeThread = new PrimeNumberCheckerThread(student);
            primeThread.start();

            ageThread.join();
            int age = ageThread.getAge();
            String encodedAge = ageThread.getEncodedAge();

            primeThread.join();
            int sum = primeThread.getSum();
            boolean isDigitPrime = primeThread.isPrime(sum);

            ResultWriter resultWriter = new ResultWriter(student, age, sum, isDigitPrime);
            resultWriter.writeResultToFile();

            System.out.println("Kết quả đã được ghi vào file kq.xml.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
