package com.designCenter.designCenter.dto.user;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserResDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Date registered;
}
