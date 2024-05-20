package com.rentify.rentify.service;

import com.rentify.rentify.dto.RegisterDto;
import com.rentify.rentify.model.Register;

public interface RegisterService {

    Register save(RegisterDto registerDto);
}
