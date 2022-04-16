package com.lukenation.personal.balance.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Balance")
public class Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Account account;
    
    @OneToMany
    @JoinColumn(name = "movement_id")
    private List<Movement> movements;
    private Date startDate;
    private Date endDate;
    private Double finalAmount;
}
