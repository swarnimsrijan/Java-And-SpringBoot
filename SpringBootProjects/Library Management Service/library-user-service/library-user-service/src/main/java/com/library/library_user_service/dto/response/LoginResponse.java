package com.library.library_user_service.dto.response;

import com.library.library_user_service.dto.request.UserDTO;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
    private String token;
    private UserDTO userDTO;
}
