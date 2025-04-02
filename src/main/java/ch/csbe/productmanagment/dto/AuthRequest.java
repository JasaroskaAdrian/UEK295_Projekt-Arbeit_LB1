package ch.csbe.productmanagment.dto;

import lombok.Data;

@Data
// DTO for authentication requests with username and password
public class AuthRequest {
    private String username;
    private String password;

}
