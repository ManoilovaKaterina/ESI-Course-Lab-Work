package com.esipractic.esiproject.products;
import java.math.BigDecimal;

public class  Product {

// Add the following attributes to the product class

    private String id;
    private String name;
    private String description;
    private BigDecimal price;
    public Product() {
    }
    public Product(String id, String name, String description, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }  

// Some of these annotations will appear with a red line under indicating an error. 
// Hover over each one of them and if you choose "quick fix", it will suggest you to "import the required package".
}