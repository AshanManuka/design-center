package com.designCenter.designCenter.service.impl;

import com.designCenter.designCenter.constant.CommonConstant;
import com.designCenter.designCenter.dto.common.CustomServiceException;
import com.designCenter.designCenter.dto.user.UserReqDto;
import com.designCenter.designCenter.dto.user.UserResDto;
import com.designCenter.designCenter.entity.User;
import com.designCenter.designCenter.enums.ActiveStatus;
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
        User user = userRepository.findByEmail(reqDto.getEmail());
        log.info("Checking, is email already exists..");
        if(user != null) throw new CustomServiceException(CommonConstant.DuplicateConstants.EMAIL_ALREADY_EXIST);

        user = User.builder()
                .name(reqDto.getName())
                .email(reqDto.getEmail())
                .gender(reqDto.getGender())
                .postalCode(reqDto.getPostalCode())
                .mobile(reqDto.getMobile())
                .password(reqDto.getPassword())
                .registered(new Date())
                .updated(new Date())
                .status(ActiveStatus.PENDING)
                .build();

        log.info("Saving User email:{} by Id:{} ",user.getEmail(),user.getId());
        User savedUser = userRepository.save(user);
        return this.modelMapper.map(savedUser,UserResDto.class);
    }
}
