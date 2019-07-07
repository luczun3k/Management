import java.awt.*;

public class Product {

    private Long id;
    private String productName;
    private Float price;
    private Float weight;
    private Color color;
    private Integer productCount;

    public Product(Long id, String productName, Float price, Float weight, Color color,
                   Integer productCount){
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.productCount = productCount;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }


    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
}
