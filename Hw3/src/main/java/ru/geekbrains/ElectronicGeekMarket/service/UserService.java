package ru.geekbrains.ElectronicGeekMarket.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.geekbrains.ElectronicGeekMarket.service.repr.SystemUser;

import java.util.List;

public interface UserService extends UserDetailsService {

    Object findById(Long id);

    SystemUser findByUserName(String username);

    boolean save(SystemUser systemUser);

    void delete(Long id);

    List<SystemUser> findAll();
}