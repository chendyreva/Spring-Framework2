package ru.geekbrains.ElectronicGeekMarket.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.ElectronicGeekMarket.persist.model.Brand;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}