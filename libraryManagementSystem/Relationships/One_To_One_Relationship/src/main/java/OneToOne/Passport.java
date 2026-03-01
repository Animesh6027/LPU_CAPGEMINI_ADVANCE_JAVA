package OneToOne;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Passport_Table")
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passport_seq")
	@SequenceGenerator(name = "passport_seq", sequenceName = "passport_sequence", initialValue = 1, allocationSize = 1)
	private int passportId;
	private String passportNumber;
	private String country;
	
	
	@OneToOne(mappedBy = "passport")
	private Person person;
	
	public Passport() {}
	
	public Passport(String passportNumber, String country) {
		this.passportNumber = passportNumber;
		this.country = country;
	}
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
