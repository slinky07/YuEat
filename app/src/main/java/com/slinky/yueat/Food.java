package com.slinky.yueat;

/**
 * Created by slinky on 2017/5/24.
 * <br>
 * <br>
 * class to to contain all the food items, them being name, drawable, desctiption and image and price for foods and categories.
 */
public class Food {
     private String name;
     private String description; //description
     private int img;
     private double price;

    public Food(String name, int img, String des, double price) {
        this.description = des;
        this.name = name;
        this.img = img;
        this.price = price;
    }

    /**
     * overloaded constructor for food categories
     * @param name is name of the food
     * @param img is the image of the food
     */
    public Food(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

