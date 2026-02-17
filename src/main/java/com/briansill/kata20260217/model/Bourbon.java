package com.briansill.kata20260217.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bourbon")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bourbon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String distillery;
    private Integer age;
    private Double proof;
    private String style;
    private String tasting_notes;

}
