package be.ehb.products.model;

import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}

