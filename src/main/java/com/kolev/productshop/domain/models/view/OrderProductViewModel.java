package com.kolev.productshop.domain.models.view;

import java.math.BigDecimal;

public class OrderProductViewModel {

    private ProductDetailsViewModel product;
    private BigDecimal price;
    private int stock;
    public OrderProductViewModel() {
    }
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ProductDetailsViewModel getProduct() {
        return product;
    }

    public void setProduct(ProductDetailsViewModel product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
