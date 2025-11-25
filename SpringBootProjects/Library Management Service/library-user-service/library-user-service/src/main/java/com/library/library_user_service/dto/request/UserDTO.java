package com.library.library_user_service.dto.request;

import com.library.library_user_service.enums.UserRole;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserDTO {
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private UserRole role;
    private Boolean active;
    private LocalDateTime createdAt;


}
