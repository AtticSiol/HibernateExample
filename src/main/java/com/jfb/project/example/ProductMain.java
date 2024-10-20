package com.jfb.project.example;

import com.jfb.project.example.entity.Product;
import com.jfb.project.example.service.ProductService;

public class ProductMain {
  public static void main(String[] args) {
    ProductService productService = new ProductService();
    Product product = productService.getProductById(2L);
    System.out.println(product);
  }
}
