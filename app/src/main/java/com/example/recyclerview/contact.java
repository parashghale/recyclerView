package com.example.recyclerview;

public class contact {
    private String name;
    private String phone;
    private String imageId;

    public contact(String name, String phone, String imageId) {
        this.name = name;
        this.phone = phone;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
}
