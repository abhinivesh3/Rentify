package com.rentify.rentify.service.impl;

import com.rentify.rentify.dto.RegisterDto;
import com.rentify.rentify.model.Register;
import com.rentify.rentify.repository.RegisterRepository;
import com.rentify.rentify.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterImplService implements RegisterService {
   @Autowired
   private RegisterRepository registerRepository;

    @Override
    public Register save(RegisterDto registerDto) {
        Register register1=new Register( registerDto.getFirstName(), registerDto.getLastName(),registerDto.getEmail(),registerDto.getEmail(),registerDto.getPhoneNumber(), registerDto.getRole());
        return registerRepository.save(register1);
    }


}
