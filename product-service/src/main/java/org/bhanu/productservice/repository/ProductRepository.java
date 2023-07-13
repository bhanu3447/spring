package org.bhanu.productservice.repository;

import java.util.List;

import org.bhanu.productservice.entity.ProductEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ProductRepository 
{
  
  @Autowired
  private  SessionFactory sessionFactory;
  
  public ProductEntity saveProduct(ProductEntity productEntity)
  {
	    try
	    {
		 Session session = sessionFactory.openSession();
		 Transaction transaction = session.beginTransaction();
		 session.save(productEntity);
		 transaction.commit();
		 session.close();
	     }catch(Exception e)
		 {
			 
		 }
		return productEntity;
  }
  
  public ProductEntity findProductById(long id) 
  {
	  String hqlQuery="from ProductEntity where id=:e";
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
	  Query query = session.createQuery(hqlQuery);
	  query.setParameter("e",id);
	  ProductEntity item=(ProductEntity)query.uniqueResult();
	  transaction.commit();
	  session.close();
	  return item;
}
  
  public List<ProductEntity> findAllProduct()
  {
	  String hqlQuery="from ProductEntity";
	  Session session = sessionFactory.openSession();
	  Query query = session.createQuery(hqlQuery);
	  return query.getResultList();
  }
  
  public Integer findProductQuantityById(Long id) 
  {
	    String hqlQuery = "select quantity from ProductEntity where id=:e";
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    Query query = session.createQuery(hqlQuery);
	    query.setParameter("e", id);
	    Integer quantity = (Integer) query.uniqueResult();
	    transaction.commit();
	    session.close();
	    return quantity;
	}

  
  public ProductEntity deleteProductById(Long id)
  {
	  Session session = sessionFactory.openSession(); 
	  Transaction transaction = session.beginTransaction(); 
	  ProductEntity productEntity = session.get(ProductEntity.class, id);
	  session.delete(productEntity);
	  transaction.commit();
	  session.close(); 
	  return productEntity; 
	}

	 
  
  public ProductEntity Product(ProductEntity productEntity)
  {
	return productEntity;
	  
	  
  }
  
  
  
  public List<ProductEntity> findAllProductsSortedByName()
  {
	        String hqlQuery="SELECT p FROM ProductEntity p ORDER BY p.name ASC";
			  Session session = sessionFactory.openSession();
			  Transaction transaction = session.beginTransaction();
			  Query query = session.createQuery(hqlQuery);
			  List<ProductEntity> list = query.list();
			  transaction.commit();
			  session.clear();
			  return list;
  }
  
  
  public List<ProductEntity> getProductByName(String name)
  {
	    String hqlQuery="from ProductEntity where name=:n";
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    Query query = session.createQuery(hqlQuery);
	    query.setParameter("n", name);
	    List<ProductEntity> list = query.list();
	    transaction.commit();
	    session.close();
	    return list;
	
	  
  }
  
  

	public List<ProductEntity> getProductInRange(double lowerprice, double higherprice) 
    {
		String hqlQuery="from ProductEntity where price between :lowerprice and :higherprice";
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    Query query = session.createQuery(hqlQuery);
	    query.setParameter("lowerprice", lowerprice);
	    query.setParameter("higherprice", higherprice);
	    List<ProductEntity> list = query.list();
	    transaction.commit();
	    session.close();
	    return list;
	}
	
	
	public double findProductPriceByProductID(long id ) 
	{
		String hqlQuery="select price from ProductEntity where id=:id ";
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    Query query = session.createQuery(hqlQuery);
	    query.setParameter("id", id);
	    double d= (double) query.uniqueResult();
	    transaction.commit();
	    session.close();
	    return d;
	}


}
