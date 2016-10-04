package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="Partners", 
uniqueConstraints={ @UniqueConstraint(columnNames={"partnerID"})})
@Proxy(lazy=false)
public class Partners {
	@Id
	private int partnerID;
	@Column(name="partnerType", length=25, nullable=true)
	private String partnerType;
	@Column(name="partnerName", length=25, nullable=true)
	private String partnerName;
	private Product product;
	
	

	public void setPartnerID(int partnerID) {
		this.partnerID = partnerID;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getPartnerID() {
		return partnerID;
	}

	public String getPartnerType() {
		return partnerType;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public Product getProduct() {
		return product;
	}
	
	

}