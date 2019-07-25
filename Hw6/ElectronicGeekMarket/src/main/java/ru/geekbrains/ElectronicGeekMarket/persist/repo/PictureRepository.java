package ru.geekbrains.ElectronicGeekMarket.persist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.geekbrains.ElectronicGeekMarket.persist.model.Picture;

public interface PictureRepository extends JpaRepository<Picture, Long> {
}