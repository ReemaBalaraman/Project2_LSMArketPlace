package com.service.product;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.jws.WebService;

import com.service.representation.product.ProductRepresentation;
import com.service.representation.product.ProductRequest;

@WebService
public interface ProductService {
	   
	public Set<ProductRepresentation> getProduct();
	public ProductRepresentation getProduct(String employeeId);
	public String addProduct(ProductRequest productRequest);
	public void buyProduct(String email,Date orderDate,Map<String,Integer> productQuantity);
   
    //public Response updateEmployee(EmployeeRequest employeeRequest);
    //public Response deleteEmployee(String employeeId);
	
	

}