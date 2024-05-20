package com.rentify.rentify.repository;

import com.rentify.rentify.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends JpaRepository<Seller,Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM Seller WHERE Place:=place")
    List<Seller> findPlace(String place);
    @Query(nativeQuery = true, value = "SELECT * FROM Seller WHERE Area:=area")
    List<Seller> findArea(String area);

    @Query(nativeQuery = true, value = "SELECT * FROM Seller WHERE NoOfBedroom:=noOfBedRoom")
    List<Seller> findNoOfBedRoom(int noOfBedRoom);

    @Query(nativeQuery = true, value = "SELECT * FROM Seller WHERE NoOfBathroom:=noOfBathRoom")
    List<Seller> findNoOfBathRoom(int noOfBathRoom);
}
