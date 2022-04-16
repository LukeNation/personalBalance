package com.lukenation.personal.balance.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Movement")
public class Movement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date movementDate;
    private Double amount;
    private String concept;
    private String currencyCode;
    private String type;

}
