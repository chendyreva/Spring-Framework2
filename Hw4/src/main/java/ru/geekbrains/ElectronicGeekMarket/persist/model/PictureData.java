package ru.geekbrains.ElectronicGeekMarket.persist.model;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "pictures_data")
public class PictureData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Lob
    @Column(name = "data", nullable = false, columnDefinition="MEDIUMBLOB")
    private byte[] data;

    public PictureData() {
    }

    public PictureData(byte[] data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}