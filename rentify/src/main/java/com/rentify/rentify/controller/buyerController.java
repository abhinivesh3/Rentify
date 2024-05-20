package com.rentify.rentify.controller;

import com.rentify.rentify.model.Seller;
import com.rentify.rentify.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/buyer")
public class buyerController {

    @Autowired
    private BuyerService buyerService;

    @GetMapping("/All")
    public List<Seller> getAllSeller(){
        return buyerService.getAll();
    }

    @GetMapping("/Filter/{place}")
    public List<Seller> getFilterSellerPlace(String place){
        return buyerService.getFilterPlace(place);
    }

    @GetMapping("/Filter/{area}")
    public List<Seller> getFilterSellerArea(String area){
        return buyerService.getFilterArea(area);
    }

    @GetMapping("/Filter/{noOfBedroom}")
    public List<Seller> getFilterSellerBedRoom(int noOfBedroom){
        return buyerService.getFilterBedRoom(noOfBedroom);
    }

    @GetMapping("/Filter/{noOfBathroom}")
    public List<Seller> getFilterSellerBathRoom(int noOfBathroom){
        return buyerService.getFilterBathRoom(noOfBathroom);
    }

}
