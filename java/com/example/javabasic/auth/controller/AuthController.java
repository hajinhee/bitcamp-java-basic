package com.example.javabasic.auth.controller;

import com.example.javabasic.auth.domain.*;
import com.example.javabasic.auth.service.MemberService;
import com.example.javabasic.auth.service.MemberServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.javabasic.controller
 * fileName   : Controller
 * author     : HAJINHEE
 * date       : 2022-01-30
 * desc       :
 * ================================
 * DATE       AUTHOR       NOTE
 * ================================
 * 2022-01-30   HAJINHEE    최초 생성
 */
public class AuthController {
    public void execute(Scanner scanner) {
        MemberService service = new MemberServiceImpl();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();

        while (true){
            System.out.println("메뉴");
            System.out.println("0.Exit 1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN");
            String res = "";

            switch (scanner.next()){
                case "0" :
                    System.out.println("Goodbye"); return;
                case "1" :
                    System.out.println((BmiDTO.TITLE + "\n이름, 키, 몸무게 입력"));
                    BmiDTO bmi = BmiDTO.getInstance();
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextInt());
                    bmi.setWeight(scanner.nextInt());
                    res = service.getBmi(bmi);  break;
                case "2" :
                    System.out.println(CalcDTO.TITLE + "\n숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.calc(calc); break;
                case "3" :
                    System.out.println(GoogleDTO.TITLE + "\n검색어 입력");
                    google.setSearch(scanner.next());
                    res = service.search(google); break;
                case "4" :
                    System.out.println("총 학생수 입력");
                    GradeDTO[] grades = new GradeDTO[scanner.nextInt()];
                    for (int i = 0; i < grades.length; i++) {
                        System.out.println(i + "번 이름, 국어점수, 영어점수, 수학점수 입력");
                        grades[i] = GradeDTO.getInstance();
                        grades[i].setName(scanner.next());
                        grades[i].setKor(scanner.nextInt());
                        grades[i].setEng(scanner.nextInt());
                        grades[i].setMath(scanner.nextInt());
                    }
                    break;
                case "5" :
                    System.out.println(UserDTO.TITLE + "\n아이디, 비밀번호, 이름 입력");
                    UserDTO user = UserDTO.getInstance();
                    user.setId(scanner.next());
                    user.setPw(scanner.next());
                    user.setName(scanner.next());
                    res = service.login(user);
                    break;
                default:
                    res = "Error"; break;
            }
            System.out.println(res);
        }
    }
}
