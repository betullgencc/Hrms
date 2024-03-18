package kodlamaio.hrms.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employers")
public class Employers {
	
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webAddresses;
	
	@Column(name="phone_number")
	private int phoneNumber;
	
	public Employers(int id, String companyName, String webAddresses, int phoneNumber) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.webAddresses = webAddresses;
		this.phoneNumber = phoneNumber;
	}
	public Employers() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWebAddresses() {
		return webAddresses;
	}
	public void setWebAddresses(String webAddresses) {
		this.webAddresses = webAddresses;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

}

