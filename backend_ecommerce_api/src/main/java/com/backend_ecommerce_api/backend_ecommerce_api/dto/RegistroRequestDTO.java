package com.backend_ecommerce_api.backend_ecommerce_api.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class RegistroRequestDTO {
    private String nombreCompleto;
    private String direccion;
    private int telefono;
    private Date fechaNacimiento;
    private String avatar;
    private String email;
    private String password;
}
