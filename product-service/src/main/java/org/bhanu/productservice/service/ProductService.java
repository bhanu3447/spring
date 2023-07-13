package org.bhanu.productservice.service;

import java.util.List;

import org.bhanu.productservice.entity.ProductEntity;


public interface ProductService 
{
	public ProductEntity saveProduct(ProductEntity productEntity);
	  
	  public ProductEntity findProductById(long id);
	  
	  public List<ProductEntity> findAllProduct();
	  
	  public Integer findProductQuantityById(Long id);
	  
	  public ProductEntity deleteProductById(Long id);
	  
	  public List<ProductEntity> findAllProductsSortedByName();
	  
	  public List<ProductEntity> getProductByName(String name);
	  
	  public List<ProductEntity> getProductInRange(double lowerprice,double higherprice);
	  
	  public double findProductPriceByProductID(long id);
}
