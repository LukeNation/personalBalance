package com.lukenation.personal.balance.service;

import com.lukenation.personal.balance.DTO.request.UserRequest;
import com.lukenation.personal.balance.model.User;

public interface UserService {

    User createNewUser(UserRequest userRequest);
}
