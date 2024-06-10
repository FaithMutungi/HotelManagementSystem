package com.Precious.PreciousHotel.controller;

import com.Precious.PreciousHotel.dto.LoginRequest;
import com.Precious.PreciousHotel.dto.Response;
import com.Precious.PreciousHotel.entity.User;
import com.Precious.PreciousHotel.service.interfac.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final IUserService userService;

    @PostMapping("/register")
    public ResponseEntity<Response> register(@RequestBody User user){
        Response response= userService.register(user);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

    @PostMapping("/login")
    public ResponseEntity<Response> login(@RequestBody LoginRequest loginRequest){
        Response response= userService.login(loginRequest);
        return ResponseEntity.status(response.getStatusCode()).body(response);
    }

}
