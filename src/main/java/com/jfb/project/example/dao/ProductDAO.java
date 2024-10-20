package com.jfb.project.example.dao;

import com.jfb.project.example.entity.Product;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductDAO {

  public void saveProduct(Product product) {
    Session session = SessionFactoryProvider.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    session.save(product);
    transaction.commit();
    session.close();
  }

  public Product getProductById(Long id) {
    return SessionFactoryProvider.getSessionFactory().openSession().get(Product.class, id);
  }

  public void updateProduct(Product product) {
    Session session = SessionFactoryProvider.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    session.update(product);
    transaction.commit();
    session.close();
  }

  public void deleteProduct(Product product) {
    Session session = SessionFactoryProvider.getSessionFactory().openSession();
    Transaction transaction = session.beginTransaction();
    session.delete(product);
    transaction.commit();
    session.close();
  }
}
