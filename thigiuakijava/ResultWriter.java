package thigiuakijava;

import java.io.File;
import java.io.FileWriter;

public class ResultWriter {
    private Student student;
    private int age;
    private int sum;
    private boolean isDigitPrime;

    public ResultWriter(Student student, int age, int sum, boolean isDigitPrime) {
        this.student = student;
        this.age = age;
        this.sum = sum;
        this.isDigitPrime = isDigitPrime;
    }

    public void writeResultToFile() {
        try {
            Result result = new Result(student, age, sum, isDigitPrime);

            JAXBContext jaxbContext = JAXBContext.newInstance(Result.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);

            File file = new File("kq.xml");
            marshaller.marshal(result, file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

