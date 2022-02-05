package com.example.javabasic.service;

import com.example.javabasic.DTO.LoginDTO;

import java.util.Scanner;

public class LoginService {
    public String execute(LoginDTO login) {
        return String.format("아이디 %s님 환영합니다.", login.getId());
    }
}
