package thigiuakijava;
// lưu kết quarcos 
public class Result {
    private Student student;
    private int age;
    private int sum;
    private boolean isDigitPrime;

    

    public Result(Student student, int age, int sum, boolean isDigitPrime) {
		super();
		this.student = student;
		this.age = age;
		this.sum = sum;
		this.isDigitPrime = isDigitPrime;
	}



	public Student getStudent() {
		return student;
	}



	public void setStudent(Student student) {
		this.student = student;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getSum() {
		return sum;
	}



	public void setSum(int sum) {
		this.sum = sum;
	}



	public boolean isDigitPrime() {
		return isDigitPrime;
	}



	public void setDigitPrime(boolean isDigitPrime) {
		this.isDigitPrime = isDigitPrime;
	}


}
