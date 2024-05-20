package com.rentify.rentify.repository;

import com.rentify.rentify.model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register,Long> {
}
