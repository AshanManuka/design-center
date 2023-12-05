package com.designCenter.designCenter.controller;

import com.designCenter.designCenter.dto.user.UserReqDto;
import com.designCenter.designCenter.dto.user.UserResDto;
import com.designCenter.designCenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Log4j2
@RequestMapping(value = "/public")
public class MainController {

    private final UserService userService;


    @PostMapping(value = "/sign-up")
    public ResponseEntity<?> userSignUp(@RequestBody UserReqDto reqDto){
        log.info("New User sign-up, name :{}",reqDto.getName());
        UserResDto resDto = userService.userSignUp(reqDto);
        return ResponseEntity.ok(resDto);
    }

}