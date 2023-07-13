package org.bhanu.ums.repository;

import java.util.Collections;
import java.util.List;

import org.bhanu.ums.entity.RegisterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


@Repository
public class RegisterRepository 
{
	@Autowired
	private SessionFactory sessionFactory;
	
 public void saveUser(RegisterEntity registerEntity)
 {
	 try
	 {
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	session.save(registerEntity);
	transaction.commit();
	 }catch(Exception e)
	 {
		 
	 }
	 
	 
 }
 
 public List<RegisterEntity> findAllUsers()
 {
	 try
	 {
		 String hqlQuery="from RegisterEntity";
	Session session = sessionFactory.openSession();
	Query query = session.createQuery(hqlQuery);
	return query.getResultList();
	 }catch(Exception e)
	 {
		 
	 }
	return Collections.EMPTY_LIST;
	
	 
 }
}
