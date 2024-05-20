package com.rentify.rentify.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "Place")
    private String place;

    @Column(name = "Area")
    private String area;

    @Column(name = "NoOfBedroom")
    private int numberOfBedroom;

    @Column(name = "NoOfBathroom")
    private int numberOfBathroom;

    @Column(name = "NoOfHospitalsNearBy")
    private int numberOfHospitalsNearBy;

    @Column(name = "NoOfCollegesNearBy")
    private int numberOfCollegesNearBy;

    public Seller(String place, String area, int numberOfBedroom, int numberOfBathroom, int numberOfHospitalsNearBy, int numberOfCollegesNearBy) {
    }
}
