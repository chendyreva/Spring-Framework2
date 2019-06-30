package ru.geekbrains.ElectronicGeekMarket.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.geekbrains.ElectronicGeekMarket.persist.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("from User u join fetch u.roles r where u.userName = :userName")
    User findOneByUserName(String userName);
}
