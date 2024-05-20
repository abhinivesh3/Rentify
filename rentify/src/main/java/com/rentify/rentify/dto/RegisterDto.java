package com.rentify.rentify.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private long phoneNumber;
    private String role;
}
