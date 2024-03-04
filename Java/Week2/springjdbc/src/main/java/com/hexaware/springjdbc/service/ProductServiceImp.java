package com.hexaware.springjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbc.dao.IProductDao;
import com.hexaware.springjdbc.exception.ProductNotFoundException;
import com.hexaware.springjdbc.model.Product;

@Service
public class ProductServiceImp implements IProductService{
	
	@Autowired
	IProductDao dao;

	@Override
	public boolean createProduct(Product product) {
		
		return dao.createProduct(product);
	}

	@Override
	public boolean updateProduct(Product product) {
		
		return dao.updateProduct(product);
	}

	@Override
	public boolean deleteProductById(int productId) throws ProductNotFoundException{
		
		List<Product> products = dao.selectAllProducts();
		boolean isFound=false;
		for(Product p:products) {
			if(p.getProductId()==productId) {
				isFound=true;
				break;
			}
		}
		Product product =null;
		try {
			if(!isFound) {
				throw new ProductNotFoundException("Product Id doesn't match our record...");
			}else {
				product=dao.selectProductById(productId);
			}
		}catch(ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return isFound;
	}

	@Override
	public Product selectProductById(int productId) throws ProductNotFoundException {
		
		List<Product> products = dao.selectAllProducts();
		boolean isFound=false;
		for(Product p:products) {
			if(p.getProductId()==productId) {
				isFound=true;
				break;
			}
		}
		Product product =null;
		try {
			if(!isFound) {
				throw new ProductNotFoundException("Product Id doesn't match our record...");
			}else {
				product=dao.selectProductById(productId);
			}
		}catch(ProductNotFoundException e) {
			System.out.println(e.getMessage());
		}
		return product;

	}

	@Override
	public List<Product> selectAllProducts() {
		
		return dao.selectAllProducts();
	}

}
