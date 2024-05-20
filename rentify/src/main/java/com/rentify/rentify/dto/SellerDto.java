package com.rentify.rentify.dto;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SellerDto {

    private Long id;
    private String place;
    private String area;
    private int numberOfBedroom;
    private int numberOfBathroom;
    private int numberOfHospitalsNearBy;
    private int numberOfCollegesNearBy;
}

