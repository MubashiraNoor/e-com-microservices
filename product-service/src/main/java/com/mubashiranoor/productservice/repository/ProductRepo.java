package com.mubashiranoor.productservice.repository;

import com.mubashiranoor.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo  extends MongoRepository<Product, String> {
}
