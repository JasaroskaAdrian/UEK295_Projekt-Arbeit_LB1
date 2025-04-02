package ch.csbe.productmanagment.dto;

// DTO for authentication response containing JWT token
public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
