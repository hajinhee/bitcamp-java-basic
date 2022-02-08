package com.example.javabasic.service;

import com.example.javabasic.auth.domain.HelloDTO;

public class HelloService {
    public String execute(HelloDTO hello) {
        return (hello.getPw()==123) ? String.format("%s님 패스워드 %s가 맞습니다. 로그인 성공",
                hello.getName(), hello.getPw()) : String.format("아이디 %s는 맞지만 패스워드 %s가 틀립니다. 로그인 실패",
                hello.getId(), hello.getPw());
    }
}
