package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
public class Stock {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToMany
    @JoinTable(name="STOCK_PROD",
            joinColumns=@JoinColumn(name="STOCK_ID"),
            inverseJoinColumns=@JoinColumn(name="PROD_ID"))
    private Collection<Product> product;

    @OneToOne
    @JoinColumn(name="LOC_ID")
    private Location location;
    private Integer quantity;
}
