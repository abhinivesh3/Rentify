package com.rentify.rentify.controller;

import com.rentify.rentify.dto.SellerDto;
import com.rentify.rentify.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sellers")
public class sellerController {

    @Autowired
    private SellerService sellerService;

    @PostMapping("/post")
    public String newPlace(SellerDto sellerDto){
        sellerService.addNewPlace(sellerDto);
        return "Successfully Saved!!";
    }

    @PutMapping("/{id}")
    public String updatePlace(Long id,SellerDto sellerDto){
        sellerService.updatePlace(id,sellerDto);
        return "Successfully Updated!!";
    }

    @DeleteMapping("/{id}")
    public String deletePlace(Long id){
        sellerService.delete(id);
        return "Successfully Deleted!!";
    }
}
