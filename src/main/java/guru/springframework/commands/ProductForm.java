package guru.springframework.commands;


import java.math.BigDecimal;

/**
 * Created by jt on 1/10/17.
 */
public class ProductForm {
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
}
   