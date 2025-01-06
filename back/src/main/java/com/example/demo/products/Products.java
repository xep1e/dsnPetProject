package com.example.demo.products;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer products_id;
    private  String name;
    private  String description;
    private BigDecimal price;
    private Integer category_id;

    public Products() {

    }

    public Products(String name, String description, BigDecimal price, Integer category_id) {

        this.name = name;
        this.description = description;
        this.price = price;
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Producrs{" +
                "products_id=" + products_id +
                ", name='" + name + '\'' +
                ", products='" + description + '\'' +
                ", price=" + price +
                ", category_id=" + category_id +
                '}';
    }

    public Integer getProducts_id() {
        return products_id;
    }

    public void setProducts_id(Integer products_id) {
        this.products_id = products_id;
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

    public void setDescription(String products) {
        this.description = products;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
}
