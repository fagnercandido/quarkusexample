package com.example.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class People extends PanacheEntity {

    private String name;
    private LocalDate bith;
    private String middle;

}
