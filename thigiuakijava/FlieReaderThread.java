package thigiuakijava;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class FileReaderThread extends Thread {
    private File file;
    private Student student;

    public FileReaderThread(File file) {
        this.file = file;
    }

    @Override
    public void run() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            student = (Student) jaxbUnmarshaller.unmarshal(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Student getStudent() {
        return student;
    }
}

