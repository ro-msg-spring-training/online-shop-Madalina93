package ro.msg.learning.shop.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
public class Revenue {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToOne
    private Location location;
    private LocalDate date;
    private BigDecimal sum;
}
