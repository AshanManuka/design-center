package com.designCenter.designCenter.dto.user;

import com.designCenter.designCenter.enums.Gender;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UserReqDto {
    private String name;
    private String mobile;
    private String postalCode;
    private Gender gender;
    private String email;
    private String password;

}
