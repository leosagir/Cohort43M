package code.rrmDTOFrendly.entity;

public class Product {

    private Integer id;
    private String productName;
    private Double price;
    private String description;

    public Product(String productName, Double price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public Product(Integer id, String productName, Double price, String description) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
