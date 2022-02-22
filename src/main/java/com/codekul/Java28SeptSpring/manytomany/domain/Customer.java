package com.codekul.Java28SeptSpring.manytomany.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String address;

    @ManyToMany
    @JoinTable(name = "customer_product" , joinColumns = {@JoinColumn (name = "customer_id", referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn (name = "product_id" , referencedColumnName = "id")}
    )
    private List<Product> products;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
