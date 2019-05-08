package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    private BigDecimal price;
    private Double weight;
    @ManyToOne
    @JoinColumn(name="PC_ID")
    private ProductCategory productCategory;
    @ManyToMany
    //@JoinTable(name ="PRO_SUPP", joinColumns = @JoinColumn(name = "PRO_ID"),
        //    inverseJoinColumns = @JoinColumn(name="SUPP_ID"))
    private Collection<Supplier> suppliers;

}
