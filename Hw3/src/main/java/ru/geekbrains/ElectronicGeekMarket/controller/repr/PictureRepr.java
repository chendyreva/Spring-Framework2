package ru.geekbrains.ElectronicGeekMarket.controller.repr;

import ru.geekbrains.ElectronicGeekMarket.persist.model.Picture;

public class PictureRepr {

    private Long id;

    private String name;

    private String contentType;

    public PictureRepr(Picture picture) {
        this.id = picture.getId();
        this.name = picture.getName();
        this.contentType = picture.getContentType();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}