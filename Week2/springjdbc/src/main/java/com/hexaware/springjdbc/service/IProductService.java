package com.hexaware.springjdbc.service;

import java.util.List;

import com.hexaware.springjdbc.exception.ProductNotFoundException;
import com.hexaware.springjdbc.model.Product;

public interface IProductService {
	
	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	
	public boolean deleteProductById(int productID) throws ProductNotFoundException;
	public Product selectProductById(int productID) throws ProductNotFoundException;
	
	public List<Product> selectAllProducts();
	
	

}
