package com.designCenter.designCenter.dto.user;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserReqDto {
    private String name;
    private String email;
    private String password;
}
