/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author premuditha
 */
public class Product {

    private String name;
    private Double price;
    private int quantity;
    private String description;
    private int rating;

    private Category categorie;

    public Product() {
    }

    public Product(String name, Double price, int quantity, String description, int rating, Category category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.rating = rating;
        this.categorie = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Category getCategorie() {
        return categorie;
    }

    public void setCategorie(Category categorie) {
        this.categorie = categorie;
    }
}
