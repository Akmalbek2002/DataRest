package com.example.datarest.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Maxsulot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private  Integer id;
    @Column(nullable = false)
    private  String maxsulotNomi;
    @Column(nullable = false)
    private  String maxsulotModeli;
    @Column(nullable = false)
    private  double maxsulotNarxi;
    @Column(nullable = false)
    private  Integer maxsulotSoni;

}
