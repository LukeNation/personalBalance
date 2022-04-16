package com.lukenation.personal.balance.DTO.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

    private String name;
    private String lastName;
    private String email;
    private String passwordRaw;

}
