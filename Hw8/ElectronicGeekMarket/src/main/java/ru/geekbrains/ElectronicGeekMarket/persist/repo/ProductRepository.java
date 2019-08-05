package ru.geekbrains.ElectronicGeekMarket.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.ElectronicGeekMarket.persist.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}