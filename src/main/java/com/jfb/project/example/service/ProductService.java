package com.jfb.project.example.service;

import com.jfb.project.example.dao.ProductDAO;
import com.jfb.project.example.entity.Product;

public class ProductService {
  private final ProductDAO productDAO = new ProductDAO();

  public ProductService() {}

  public void saveProduct(Product product) {
    productDAO.saveProduct(product);
  }

  public Product getProductById(Long id) {
    return productDAO.getProductById(id);
  }

  public void updateProduct(Product product) {
    productDAO.updateProduct(product);
  }

  public void deleteProduct(Product product) {
    productDAO.deleteProduct(product);
  }
}
