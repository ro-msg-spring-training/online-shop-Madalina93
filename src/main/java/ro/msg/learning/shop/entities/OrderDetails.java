package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class OrderDetails {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToOne
    private Orders order;
    @OneToOne
    private Product product;
    private Integer quantity;
}
