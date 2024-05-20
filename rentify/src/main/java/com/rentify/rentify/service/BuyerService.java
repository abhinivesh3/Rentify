package com.rentify.rentify.service;

import com.rentify.rentify.model.Seller;

import java.util.List;

public interface BuyerService {
    List<Seller> getAll();

    List<Seller> getFilterPlace(String place);

    List<Seller> getFilterArea(String area);

    List<Seller> getFilterBedRoom(int noOfBedRoom);

    List<Seller> getFilterBathRoom(int noOfBathRoom);

}
