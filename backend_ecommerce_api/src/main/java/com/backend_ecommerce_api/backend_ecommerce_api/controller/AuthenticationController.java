package com.backend_ecommerce_api.backend_ecommerce_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.backend_ecommerce_api.backend_ecommerce_api.dto.LoginRequestDTO;
import com.backend_ecommerce_api.backend_ecommerce_api.dto.JwtResponseDTO;
import com.backend_ecommerce_api.backend_ecommerce_api.service.AuthenticationService;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public JwtResponseDTO login(@RequestBody LoginRequestDTO request) {
        return authenticationService.authenticate(request);
    }
}
