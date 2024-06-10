package com.Precious.PreciousHotel.service.interfac;

import com.Precious.PreciousHotel.dto.LoginRequest;
import com.Precious.PreciousHotel.dto.Response;
import com.Precious.PreciousHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
