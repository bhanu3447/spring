package org.bhanu.productservice.service.imp;

import java.util.List;

import org.bhanu.productservice.entity.ProductEntity;
import org.bhanu.productservice.repository.ProductRepository;
import org.bhanu.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl  implements ProductService
{

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public ProductEntity saveProduct(ProductEntity productEntity) 
	{
		return productRepository.saveProduct(productEntity);
		 
	}

	@Override
	public ProductEntity findProductById(long id) 
	{
		return productRepository.findProductById(id);
	}

	@Override
	public List<ProductEntity> findAllProduct()
	{
		return productRepository.findAllProduct();
		
	}

	@Override
	public Integer findProductQuantityById(Long id)
	{
		return productRepository.findProductQuantityById(id);
	}

	@Override
	public ProductEntity deleteProductById(Long id) 
	{
		return productRepository.deleteProductById(id);
	}

	

	@Override
	public List<ProductEntity> findAllProductsSortedByName()
	{
		return productRepository.findAllProductsSortedByName();
	}

	@Override
	public List<ProductEntity> getProductByName(String name)
	{
	  return productRepository.getProductByName(name);
	}

	@Override
	public List<ProductEntity> getProductInRange(double lowerprice, double higherprice) 
	{
		return productRepository.getProductInRange(lowerprice, higherprice);
	}

	@Override
	public double findProductPriceByProductID(long id) 
	{
		
		return productRepository.findProductPriceByProductID(id);
		
	}

}
