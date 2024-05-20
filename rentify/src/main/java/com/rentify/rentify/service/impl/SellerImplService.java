package com.rentify.rentify.service.impl;

import com.rentify.rentify.dto.SellerDto;
import com.rentify.rentify.model.Seller;
import com.rentify.rentify.repository.SellerRepository;
import com.rentify.rentify.service.SellerService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SellerImplService implements SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    @Override
    public void addNewPlace(SellerDto sellerDto) {
        Seller seller=new Seller(sellerDto.getPlace(),sellerDto.getArea(),sellerDto.getNumberOfBedroom(),sellerDto.getNumberOfBathroom(),sellerDto.getNumberOfHospitalsNearBy(),sellerDto.getNumberOfCollegesNearBy());
        sellerRepository.save(seller);
    }

    @Override
    public void updatePlace(long id, SellerDto sellerDto) {
        Optional<Seller> optionalSeller = sellerRepository.findById(id);
        if (optionalSeller.isPresent()) {
            Seller seller = optionalSeller.get();
            seller.setPlace(sellerDto.getPlace());
            seller.setArea(sellerDto.getArea());
            seller.setNumberOfBedroom(sellerDto.getNumberOfBedroom());
            seller.setNumberOfBathroom(sellerDto.getNumberOfBathroom());
            seller.setNumberOfHospitalsNearBy(sellerDto.getNumberOfHospitalsNearBy());
            seller.setNumberOfCollegesNearBy(sellerDto.getNumberOfCollegesNearBy());
            sellerRepository.save(seller);
        } else {
            throw new EntityNotFoundException("Seller not found with id: " + id);
        }
    }

    @Override
    public void delete(long id) {
        Optional<Seller> optionalSeller = sellerRepository.findById(id);
        if (optionalSeller.isPresent()) {
            sellerRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Seller not found with id: " + id);
        }
    }
}
