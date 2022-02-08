package com.example.javabasic.auth.controller;

import com.example.javabasic.auth.domain.*;
import com.example.javabasic.service.*;

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
        CalcDTO calc = new CalcDTO();
        BmiDTO bmi = new BmiDTO();
        GoogleDTO google = new GoogleDTO();
        HelloDTO hello = new HelloDTO();
        LoginDTO login = new LoginDTO();
        CalcService calcService = new CalcService();
        BmiService bmiService = new BmiService();
        GoogleService googleService = new GoogleService();
        HelloService helloService = new HelloService();
        LoginService loginService = new LoginService();

        while (true){
            System.out.println("메뉴");
            System.out.println("0.EXIT 1.CALC 2.BMI 3.GOOGLE 4.HELLO 5.LOGIN");
            String res = "";

            switch (scanner.next()){
                case "0" :
                    System.out.println("Goodbye"); return;
                case "1" :
                    System.out.println(CalcDTO.TITLE+"\n첫번째숫자, 연산자, 두번째숫자 입력하세요.");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.execute(calc); break;
                case "2" :
                    System.out.println(BmiDTO.TITLE+"\n이름, 키, 몸무게를 입력하세요.");
                    bmi.setName(scanner.next());
                    bmi.setHeight(scanner.nextDouble());
                    bmi.setWeight(scanner.nextDouble());
                    res = bmiService.execute(bmi); break;
                case "3" :
                    System.out.println(GoogleDTO.TTILE+"\n검색어를 입력하세요.");
                    google.setSearch(scanner.next());
                    res = googleService.execute(google); break;
                case "4" :
                    System.out.println(HelloDTO.TITLE+"\n이름과 아이디, 패스워드를 입력하세요.");
                    hello.setName(scanner.next());
                    hello.setId(scanner.next());
                    hello.setPw(scanner.nextInt());
                    res = helloService.execute(hello); break;
                case "5" :
                    System.out.println(LoginDTO.TITLE+"\n아이디, 패스워드, 이름을 입력하세요.");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = loginService.execute(login); break;
                default:
                    res = "Error"; break;
            }
            System.out.println(res);
        }
    }
}
