package com.rentify.rentify.service.impl;

import com.rentify.rentify.model.Seller;
import com.rentify.rentify.repository.SellerRepository;
import com.rentify.rentify.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerImplService implements BuyerService {

    @Autowired
    private SellerRepository sellerRepository;
    @Override
    public List<Seller> getAll() {
        return sellerRepository.findAll();
    }

    @Override
    public List<Seller> getFilterPlace(String place) {
        return sellerRepository.findPlace(place);
    }

    @Override
    public List<Seller> getFilterArea(String area) {
        return sellerRepository.findArea(area);
    }

    @Override
    public List<Seller> getFilterBedRoom(int noOfBedRoom) {
        return sellerRepository.findNoOfBedRoom(noOfBedRoom);
    }

    @Override
    public List<Seller> getFilterBathRoom(int noOfBathRoom) {
        return sellerRepository.findNoOfBathRoom(noOfBathRoom);
    }

}
