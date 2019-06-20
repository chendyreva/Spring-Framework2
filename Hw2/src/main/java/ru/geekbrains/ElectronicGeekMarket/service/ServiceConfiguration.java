package ru.geekbrains.ElectronicGeekMarket.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.geekbrains.ElectronicGeekMarket.persist.repo.ProductRepository;
import ru.geekbrains.ElectronicGeekMarket.persist.repo.RoleRepository;
import ru.geekbrains.ElectronicGeekMarket.persist.repo.UserRepository;

@Configuration
public class ServiceConfiguration {

    @Bean
    public UserService userService(UserRepository userRepository, RoleRepository roleRepository,
                                   BCryptPasswordEncoder passwordEncoder) {
        return new UserServiceJpaImpl(userRepository, roleRepository, passwordEncoder);
    }

    @Bean
    public ProductService productService(ProductRepository productRepository) {
        return new ProductServiceImpl(productRepository);
    }
}