package com.hexaware.springjdbc.dao;

import java.util.List;

import com.hexaware.springjdbc.exception.ProductNotFoundException;
import com.hexaware.springjdbc.model.Product;

public interface IProductDao {
	
	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	
	public boolean deleteProductById(int productID) throws ProductNotFoundException;
	public Product selectProductById(int productID) throws ProductNotFoundException;
	
	public List<Product> selectAllProducts();

}
