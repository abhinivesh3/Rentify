package com.rentify.rentify.service;

import com.rentify.rentify.dto.SellerDto;
import com.rentify.rentify.model.Seller;

public interface SellerService {

    void addNewPlace(SellerDto sellerDto);

    void updatePlace(long id,SellerDto sellerDto);

    void delete(long id);
}
