package com.lukenation.personal.balance.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String currency;

    private Double amount;

    @OneToOne
    private Balance lastBalance;

    @ManyToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "account_owner_id", nullable = false)
    private User accountOwner;

}
