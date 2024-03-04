package com.hexaware.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.exception.ProductNotFoundException;
import com.hexaware.springjdbc.model.Product;

@Repository
public class ProductDaoImp implements IProductDao{
	
	JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	public ProductDaoImp(DataSource datasource) {
		
		jdbcTemplate = new JdbcTemplate(datasource);
		
		System.out.println(jdbcTemplate);
		
		
	}

	@Override
	public boolean createProduct(Product product) {
		
		String insertQuery = "INSERT INTO Products(pid,pname,price) VALUES(?,?,?)";
		int count = jdbcTemplate.update(insertQuery, product.getProductId(),product.getProductName(), product.getPrice());
		return count>0;
	}

	@Override
	public boolean updateProduct(Product product) {
		
		String updateQuery = "UPDATE Products SET pname = ?, price = ? WHERE pid = ?";
		int count = jdbcTemplate.update(updateQuery,product.getProductName(), product.getPrice(), product.getProductId());
		return count>0;
	}

	@Override
	public boolean deleteProductById(int productId) throws ProductNotFoundException{
		
		String deleteQuery = "DELETE FROM Products WHERE pid = ?";
		int count = jdbcTemplate.update(deleteQuery,productId);
		return count>0;
	}

	@Override
	public Product selectProductById(int productId) throws ProductNotFoundException {
		
		String selectById = "SELECT pid,pname,price FROM Products WHERE pid = ?";
		Product product = jdbcTemplate.queryForObject(selectById, new ProductMapper(), productId);
		return product;
	}

	@Override
	public List<Product> selectAllProducts() {
		
		String selectAll = "SELECT pid,pname,price FROM Products";
		List<Product> list = jdbcTemplate.query(selectAll, new ProductMapper());
		return list;
		
	}

}
