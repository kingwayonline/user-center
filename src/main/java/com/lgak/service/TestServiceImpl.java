package com.lgak.service;

import org.springframework.stereotype.Service;
import service.TestService;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String getName() {
        return "user-center";
    }
}
