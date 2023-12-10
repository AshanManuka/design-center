package com.designCenter.designCenter.controller.admin;

import com.designCenter.designCenter.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin/product")
@RequiredArgsConstructor
@Log4j2
public class AdminProductController {

    private final ProductService productService;


}
