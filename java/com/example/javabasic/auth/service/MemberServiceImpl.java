package com.example.javabasic.auth.service;

import com.example.javabasic.auth.domain.*;

/**
 * packageName: com.example.javabasic.auth.service
 * fileName   : MemberServiceImpl
 * author     : HAJINHEE
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-02-08   HAJINHEE    최초 생성
 */
public class MemberServiceImpl implements MemberService{
    @Override
    public String execute(CalcDTO calc) {
        int res = 0;
        switch (calc.getOpcode()) {
            case "+":
                res = calc.getNum1() + calc.getNum2();
                break;
            case "-":
                res = calc.getNum1() - calc.getNum2();
                break;
            case "*":
                res = calc.getNum1() * calc.getNum2();
                break;
            case "/":
                res = calc.getNum1() / calc.getNum2();
                break;
            default: break;
        }
        return String.format("%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(), res);
    }

    @Override
    public String execute(BmiDTO param) {
        String res;
        double bmi = param.getWeight() / (param.getHeight() * param.getHeight()) * 10000;
        if (bmi >= 35) {
            res = "고도비만";
        } else if (bmi >= 30) {
            res = "중도비만";
        } else if (bmi >= 25) {
            res = "경도비만";
        } else if (bmi >= 23) {
            res = "과체중";
        } else if (bmi >= 18.5) {
            res = "정상";
        } else {
            res = "저체중";
        }
        return String.format("%s님의 키: %.2f 몸무게: %.2f, bmi 지수는 %s입니다.", param.getName(), param.getHeight(), param.getWeight(), res);
    }

    @Override
    public String execute(GoogleDTO google) {
        return String.format("%s을(를) 검색한 결과입니다.", google.getSearch());
    }

    @Override
    public String execute(HelloDTO hello) {
        return (hello.getPw()==123) ? String.format("%s님 패스워드 %s가 맞습니다. 로그인 성공",
                hello.getName(), hello.getPw()) : String.format("아이디 %s는 맞지만 패스워드 %s가 틀립니다. 로그인 실패",
                hello.getId(), hello.getPw());    }

    @Override
    public String execute(LoginDTO login) {
        return String.format("아이디 %s님 환영합니다.", login.getId());
    }
    }