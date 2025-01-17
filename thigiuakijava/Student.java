package thigiuakijava;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Student {
    private String id;
    private String name;
    private String address;
	private LocalDate dateOfBirth;
	private String encodedAge;
    private boolean isDigitPrime;
	public Student(String id, String name, String address, LocalDate dateOfBirth) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateOfBirth = dateOfBirth;
		
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	public int tinhTuoi() {
        return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
    }
	 public String mahoaTuoi(int age) {
	        return new StringBuilder().append(age).reverse().toString();
	    }
	 public String getEncodedAge() {
	        if (this.encodedAge == null) {
	            this.encodedAge = mahoaTuoi(tinhTuoi());
	        }
	        return this.encodedAge;
	    }

	    public boolean getIsDigitPrime() {
	        return this.isDigitPrime;
	    }


    
}
