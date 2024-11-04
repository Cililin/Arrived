package com.arrived.service;

import com.arrived.dto.UserLoginDTO;
import com.arrived.entity.User;

public interface UserService {
    /**
     * 微信登录
     *
     * @param userLoginDTO
     */

    User wxLogin(UserLoginDTO userLoginDTO);
}
