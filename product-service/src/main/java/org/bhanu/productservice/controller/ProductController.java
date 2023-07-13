package org.bhanu.productservice.controller;



import java.util.List;

import org.bhanu.productservice.entity.ProductEntity;
import org.bhanu.productservice.repository.ProductRepository;
import org.bhanu.productservice.service.imp.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@Controller
//@ResponseBody
@RestController
public class ProductController 
{
	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	  @PostMapping(value = "/saveProductDetails")
	  public ProductEntity saveProduct(@RequestBody ProductEntity productEntity)
	  {
		 return productServiceImpl.saveProduct(productEntity);
	  }
	  
	  @GetMapping(value = "/findProductById/{id}")
	  public @ResponseBody ProductEntity  findProductById(@PathVariable Long id)
	  {
		  return productServiceImpl.findProductById(id);
	  }
	  
	  @GetMapping(value = "/findAllProduct")
	  public List<ProductEntity> findAllProduct()
	  {
		  return productServiceImpl.findAllProduct();
	  }
	  
	  @GetMapping(value = "/findProductQuantityById/{id}")
	  public Integer findProductQuantityById(@PathVariable Long id)
	  {
		  return productServiceImpl.findProductQuantityById(id);
	  }
	  
	  @DeleteMapping(value = "/deleteProductById/{id}")
	  public ProductEntity deleteProductById(@PathVariable Long id)
	  {
		  return productServiceImpl.deleteProductById(id);
	  }

	  @GetMapping(value ="/findAllProductsSortedByName")
	  public List<ProductEntity> findAllProductsSortedByName()
	  {
		  return productServiceImpl.findAllProductsSortedByName();
	  }
	  
	  @GetMapping(value = "/getProductByName")
	  public List<ProductEntity> getProductByName(@RequestParam String name)
	  {
		return productServiceImpl.getProductByName(name);
		  
	  }
	  
//	  @GetMapping(value = "/getProductByName")
//	  public String getProductByName(@RequestParam("name")String name)
//	  {
//		return name;
//		  
//	  }
	  
	 @GetMapping(value ="/getProductInRange")
		public List<ProductEntity> getProductInRange(@RequestParam double lowerprice,@RequestParam double higherprice) 
	    {
			 return productServiceImpl.getProductInRange(lowerprice, higherprice);
		}
	 
	 
	   @GetMapping(value = "/findProductPriceByProductID/{id}")
		public double findProductPriceByProductID(@PathVariable Long id) 
		{
			System.out.println("product id:"+id);
			return productServiceImpl.findProductPriceByProductID(id);

			
		}

}
