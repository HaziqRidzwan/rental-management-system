package com.newhut.rms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name = "PROPERTY_INFORMATION")
public class PropertyInformation { // Table dari DB mapped dengan class object

	public static final String COLUMN_PREFIX = "PI_";
// sdfsdf
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;

	@Column(name = COLUMN_PREFIX + "PROPERTY_NAME", length = 200) // ORM - Object relational mapping
	private String propertyName;

	@Column(name = COLUMN_PREFIX + "PROPERTY_TYPE", length = 200) // column dari table mapped dengan field
	private String propertyType;

	@Column(name = COLUMN_PREFIX + "ADDRESS", length = 300)
	private String address;

	@Column(name = COLUMN_PREFIX + "MONTHLY_MORTGAGE")
	private Integer monthlyMortgage;

	@Column(name = COLUMN_PREFIX + "PAYMENT_DAY_OF_MONTH", length = 4)
	private String paymentDayOfMonth;

	@Column(name = COLUMN_PREFIX + "PROPERTY_BANK_NAME", length = 200)
	private String propertyBankName;

	@Column(name = COLUMN_PREFIX + "PROPERTY_BANK_ACCOUNT_NO", length = 30)
	private String propertyBankAccountNo;

	@Column(name = COLUMN_PREFIX + "MORTGAGE_OFFICER", length = 300)
	private String mortgageOfficer;

	@Column(name = COLUMN_PREFIX + "MRTT_TENURE_YEAR")
	private Integer mrttTenureYear;

	@Column(name = COLUMN_PREFIX + "CREATED_BY", length = 300)
	private String createdBy;

	@CreatedDate
	@Column(name = COLUMN_PREFIX + "CREATED_DATE")
	private Date createdDate;

	@Column(name = COLUMN_PREFIX + "EDITED_BY", length = 300)
	private String editedBy;

	@LastModifiedDate
	@Column(name = COLUMN_PREFIX + "EDITED_DATE")
	private Date editedDate;

	public PropertyInformation() {
		super();
	}

	public PropertyInformation(String propertyName, String propertyType, String address, Integer monthlyMortgage,
			String paymentDayOfMonth, String propertyBankName, String propertyBankAccountNo, String mortgageOfficer,
			Integer mrttTenureYear, String createdBy, Date createdDate, String editedBy, Date editedDate) {
		super();
		this.propertyName = propertyName;
		this.propertyType = propertyType;
		this.address = address;
		this.monthlyMortgage = monthlyMortgage;
		this.paymentDayOfMonth = paymentDayOfMonth;
		this.propertyBankName = propertyBankName;
		this.propertyBankAccountNo = propertyBankAccountNo;
		this.mortgageOfficer = mortgageOfficer;
		this.mrttTenureYear = mrttTenureYear;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.editedBy = editedBy;
		this.editedDate = editedDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyType() {
		return propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getMonthlyMortgage() {
		return monthlyMortgage;
	}

	public void setMonthlyMortgage(Integer monthlyMortgage) {
		this.monthlyMortgage = monthlyMortgage;
	}

	public String getPaymentDayOfMonth() {
		return paymentDayOfMonth;
	}

	public void setPaymentDayOfMonth(String paymentDayOfMonth) {
		this.paymentDayOfMonth = paymentDayOfMonth;
	}

	public String getPropertyBankName() {
		return propertyBankName;
	}

	public void setPropertyBankName(String propertyBankName) {
		this.propertyBankName = propertyBankName;
	}

	public String getPropertyBankAccountNo() {
		return propertyBankAccountNo;
	}

	public void setPropertyBankAccountNo(String propertyBankAccountNo) {
		this.propertyBankAccountNo = propertyBankAccountNo;
	}

	public String getMortgageOfficer() {
		return mortgageOfficer;
	}

	public void setMortgageOfficer(String mortgageOfficer) {
		this.mortgageOfficer = mortgageOfficer;
	}

	public Integer getMrttTenureYear() {
		return mrttTenureYear;
	}

	public void setMrttTenureYear(Integer mrttTenureYear) {
		this.mrttTenureYear = mrttTenureYear;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	public Date getEditedDate() {
		return editedDate;
	}

	public void setEditedDate(Date editedDate) {
		this.editedDate = editedDate;
	}

}
