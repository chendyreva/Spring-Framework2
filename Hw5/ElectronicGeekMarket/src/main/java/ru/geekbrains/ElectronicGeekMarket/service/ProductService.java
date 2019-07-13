package ru.geekbrains.ElectronicGeekMarket.service;

import ru.geekbrains.ElectronicGeekMarket.controller.repr.ProductRepr;


import java.io.IOException;
import java.util.List;

public interface ProductService {

    List<ProductRepr> findAll();

    Object findById(Long id);

    void deleteById(Long id);

    void save(ProductRepr product) throws IOException;


}