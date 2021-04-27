package com.celerispay.template.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Merchant")
public class MerchantDTO {
	
	@Id
	@Column(name = "MERCHANT_ID")
	private String merchantId;
	
	@Column(name = "COMPANY_NAME")
	private String companyName;

	@Column(name = "ACCESS_TOKEN")
	private String accessToken;
	
	@Column(name = "CERTIFICATES")
	private String certificates;

	@Column(name = "PRIMARY_EMAIL")
	private String primaryEmailAddress;
	
	@Column(name = "ALLOWED_CURRENCIES")
	private String allowedCurrencies;
	
	@Column(name = "ALLOWED_INTEGRATION_OPTION")
	private String allowedIntegrationOption;

    @Column(name="THREEDS_OPTED")
	private boolean threeDSOpted;
	
    @Column(name="MERCHANT_EMAIL")
	private String merchantEmail;
	
	@Column(name = "PERSON_NAME")
	private String personName;
	

}
