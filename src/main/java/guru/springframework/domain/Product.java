package guru.springframework.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;


@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long bankId;
    private String bankName;
    private String bankAbbrev;
    private Long companyId;
	public Long getBankId() {
		return bankId;
	}
	public void setBankId(Long bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAbbrev() {
		return bankAbbrev;
	}
	public void setBankAbbrev(String bankAbbrev) {
		this.bankAbbrev = bankAbbrev;
	}
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public Product orElse(Object object) {
		// TODO Auto-generated method stub
		return null;
	}
	public String getByBankName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	}
	
	
	
	

	    
