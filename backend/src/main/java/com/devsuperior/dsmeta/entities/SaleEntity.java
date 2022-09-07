package com.devsuperior.dsmeta.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table(name = "tb_sales")
@Entity
@NoArgsConstructor
public class SaleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sellerName;

    private int visited;

    private int deals;

    private Double amount;

    private LocalDate date;

}
