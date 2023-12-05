package com.designCenter.designCenter.service.impl;

import com.designCenter.designCenter.dto.user.UserReqDto;
import com.designCenter.designCenter.dto.user.UserResDto;
import com.designCenter.designCenter.entity.User;
import com.designCenter.designCenter.repository.UserRepository;
import com.designCenter.designCenter.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public UserResDto userSignUp(UserReqDto reqDto) {
        log.info("Saving User");
        User user = User.builder()
                .name(reqDto.getName())
                .email(reqDto.getEmail())
                .password(reqDto.getPassword())
                .registered(new Date())
                .build();

        User savedUser = userRepository.save(user);
        return this.modelMapper.map(savedUser,UserResDto.class);
    }
}
