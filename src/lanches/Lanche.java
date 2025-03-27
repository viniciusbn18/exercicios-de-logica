package lanches;

public class Lanche {

    private Integer id;
    private Double price;
    private Integer quantity;


    //constructors
    public Lanche() {
    }

    public Lanche(Integer id, Double price) {
        this.id = id;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Lanche{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }
}
