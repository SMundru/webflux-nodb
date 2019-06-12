package com.nbrown.springwebflux.model;


public class Product {
    private Integer productId;
    private String description;
    private double price;
    private String imageUrl;
    private boolean inSale;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isInSale() {
        return inSale;
    }

    public void setInSale(boolean inSale) {
        this.inSale = inSale;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", inSale=" + inSale +
                '}';
    }
}
