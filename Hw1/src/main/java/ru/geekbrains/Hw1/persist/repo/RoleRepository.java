package ru.geekbrains.Hw1.persist.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.geekbrains.Hw1.persist.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    @Query("from Role r where name = :name")
    Role findOneByName(String name);
}
