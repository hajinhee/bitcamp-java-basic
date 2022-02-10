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
    public String calc(CalcDTO calc) {
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
    public String getBmi(BmiDTO paramBmi) {
        String res;
        double bmi = paramBmi.getWeight() / (paramBmi.getHeight() * paramBmi.getHeight()) * 10000;
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
        return String.format("%s님의 키: %.2f 몸무게: %.2f, bmi 지수는 %s입니다.",
                paramBmi.getName(), paramBmi.getHeight(), paramBmi.getWeight(), res);    }

    @Override
    public String search(GoogleDTO google) {
        return String.format("%s을(를) 검색한 결과입니다.", google.getSearch());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";
        return String.format("* ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d점 \n" +
                        " * > 영어: %d점 \n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점 \n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################", GradeDTO.GRADE_TITLE, grade.getName(), grade.getKor(),
                grade.getEng(), grade.getMath(), total, avg, pass);
    }

    @Override
    public String login(UserDTO login) {
        return (login.getPw().equals("abc")) ? String.format("%s님의 비번 %s가 맞습니다. 로그인 성공", login.getName(), login.getPw())
                : String.format("아이디 %s는 맞고 비번 %s가 틀립니다. 로그인 실패", login.getId(), login.getPw());

    }
}