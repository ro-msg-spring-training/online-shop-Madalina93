package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity

public class Orders {
    @Id
    @GeneratedValue
    private Integer id;

    @OneToOne
    // @JoinColumn(name="ORD_ID")
    private Location shippedFrom;

    @ManyToOne
    private Customer customer;
    private LocalDateTime createdAt;
    @Embedded
    private Address address;
}
