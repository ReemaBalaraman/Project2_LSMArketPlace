package model.customer;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



import model.order.Order;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name="customer", 
uniqueConstraints={ @UniqueConstraint(columnNames={"customerID"}),@UniqueConstraint(columnNames={"email"})})
@Proxy(lazy=false)
public class Customer {
	@Id
	@Column(name="customerID")
	private int customerID;
	@Column(name="customerName", length=25, nullable=true)
	private String customerName;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress customerAddress;
	@OneToOne(cascade = CascadeType.ALL)
	private CustomerPhone customerPhone;
	@Column(name="email")
	private String email;
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="customerID")
    private Set<Order> order;
	
    public Customer()
    {
    	
    }
	

	public Customer(int customerID, String customerName,
			CustomerAddress customerAddress, CustomerPhone customerPhone, String email) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerPhone = customerPhone;
		this.email = email;

	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(CustomerAddress customerAddress) {
		this.customerAddress = customerAddress;
	}


	public void setCustomerPhone(CustomerPhone customerPhone) {
		this.customerPhone = customerPhone;
	}


	public void setOrder(Set<Order> order) {
		this.order = order;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getCustomerID() {
		return customerID;
	}

	public CustomerAddress getCustomerAddress() {
		return customerAddress;
	}

	public CustomerPhone getCustomerPhone() {
		return customerPhone;
	}

	public Set<Order> getOrder() {
		return order;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	

}